package com.robinhood.android.common.portfolio.positionsList;

import com.robinhood.android.common.portfolio.instrument.InstrumentDisplayTypeBottomSheetFragment;
import com.robinhood.android.models.portfolio.PositionsDisplayOptions;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.models.serverdriven.experimental.api.AccountPositionAction;
import com.robinhood.models.serverdriven.experimental.api.MarkdownText;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PositionsListDataState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00100\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\t\u00105\u001a\u00020\u0013HÆ\u0003J\t\u00106\u001a\u00020\u0013HÆ\u0003J\t\u00107\u001a\u00020\u0013HÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\t\u00109\u001a\u00020\u0013HÆ\u0003J§\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0013HÆ\u0001J\u0013\u0010;\u001a\u00020\u00132\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\u0017\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010(R\u0011\u0010,\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b-\u0010(¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDataState;", "", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "positionInstrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", InstrumentDisplayTypeBottomSheetFragment.FRAGMENT_RESULT_KEY, "", "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", "displayOptions", "Lcom/robinhood/android/models/portfolio/PositionsDisplayOptions;", "header", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/AccountPositionAction;", Footer.f10637type, "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "reorderPending", "", "animateItemPlacement", "futuresAssetHomeOpened", "hasOpenedEcHub", "isInEcShimmerExp", "<init>", "(Lcom/robinhood/android/models/portfolio/api/PositionsLocation;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/PositionsDisplayOptions;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lkotlinx/collections/immutable/ImmutableList;ZZZZZ)V", "getPositionsLocation", "()Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "getPositionInstrumentType", "()Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getSelectedDisplayType", "()Ljava/lang/String;", "getDisplayOptions", "()Lcom/robinhood/android/models/portfolio/PositionsDisplayOptions;", "getHeader", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getFooter", "getItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getReorderPending", "()Z", "getAnimateItemPlacement", "getFuturesAssetHomeOpened", "getHasOpenedEcHub", "shouldHeaderShimmer", "getShouldHeaderShimmer", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PositionsListDataState {
    public static final int $stable = 8;
    private final boolean animateItemPlacement;
    private final PositionsDisplayOptions displayOptions;
    private final UIComponent<AccountPositionAction> footer;
    private final boolean futuresAssetHomeOpened;
    private final boolean hasOpenedEcHub;
    private final UIComponent<AccountPositionAction> header;
    private final boolean isInEcShimmerExp;
    private final ImmutableList<PositionsV2.PositionListItemV2> items;
    private final PositionInstrumentType positionInstrumentType;
    private final PositionsLocation positionsLocation;
    private final boolean reorderPending;
    private final String selectedDisplayType;

    /* compiled from: PositionsListDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PositionInstrumentType.values().length];
            try {
                iArr[PositionInstrumentType.FUTURES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PositionInstrumentType.FUTURES_PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PositionInstrumentType.EVENT_CONTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PositionInstrumentType.EVENT_CONTRACT_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PositionInstrumentType.EQUITY_LEGACY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PositionInstrumentType.EQUITY_PENDING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PositionInstrumentType.EQUITY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO_TOKENIZED_STOCKS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PositionInstrumentType.CRYPTO_PERPETUALS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PositionInstrumentType.OPTIONS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PositionInstrumentType.OPTIONS_PENDING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PositionInstrumentType.COMBO_ORDERS_PENDING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PositionInstrumentType.PSP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PositionInstrumentType.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PositionsListDataState() {
        this(null, null, null, null, null, null, null, false, false, false, false, false, 4095, null);
    }

    public static /* synthetic */ PositionsListDataState copy$default(PositionsListDataState positionsListDataState, PositionsLocation positionsLocation, PositionInstrumentType positionInstrumentType, String str, PositionsDisplayOptions positionsDisplayOptions, UIComponent uIComponent, UIComponent uIComponent2, ImmutableList immutableList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            positionsLocation = positionsListDataState.positionsLocation;
        }
        if ((i & 2) != 0) {
            positionInstrumentType = positionsListDataState.positionInstrumentType;
        }
        if ((i & 4) != 0) {
            str = positionsListDataState.selectedDisplayType;
        }
        if ((i & 8) != 0) {
            positionsDisplayOptions = positionsListDataState.displayOptions;
        }
        if ((i & 16) != 0) {
            uIComponent = positionsListDataState.header;
        }
        if ((i & 32) != 0) {
            uIComponent2 = positionsListDataState.footer;
        }
        if ((i & 64) != 0) {
            immutableList = positionsListDataState.items;
        }
        if ((i & 128) != 0) {
            z = positionsListDataState.reorderPending;
        }
        if ((i & 256) != 0) {
            z2 = positionsListDataState.animateItemPlacement;
        }
        if ((i & 512) != 0) {
            z3 = positionsListDataState.futuresAssetHomeOpened;
        }
        if ((i & 1024) != 0) {
            z4 = positionsListDataState.hasOpenedEcHub;
        }
        if ((i & 2048) != 0) {
            z5 = positionsListDataState.isInEcShimmerExp;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        boolean z8 = z2;
        boolean z9 = z3;
        ImmutableList immutableList2 = immutableList;
        boolean z10 = z;
        UIComponent uIComponent3 = uIComponent;
        UIComponent uIComponent4 = uIComponent2;
        return positionsListDataState.copy(positionsLocation, positionInstrumentType, str, positionsDisplayOptions, uIComponent3, uIComponent4, immutableList2, z10, z8, z9, z6, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final PositionsLocation getPositionsLocation() {
        return this.positionsLocation;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getFuturesAssetHomeOpened() {
        return this.futuresAssetHomeOpened;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getHasOpenedEcHub() {
        return this.hasOpenedEcHub;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsInEcShimmerExp() {
        return this.isInEcShimmerExp;
    }

    /* renamed from: component2, reason: from getter */
    public final PositionInstrumentType getPositionInstrumentType() {
        return this.positionInstrumentType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedDisplayType() {
        return this.selectedDisplayType;
    }

    /* renamed from: component4, reason: from getter */
    public final PositionsDisplayOptions getDisplayOptions() {
        return this.displayOptions;
    }

    public final UIComponent<AccountPositionAction> component5() {
        return this.header;
    }

    public final UIComponent<AccountPositionAction> component6() {
        return this.footer;
    }

    public final ImmutableList<PositionsV2.PositionListItemV2> component7() {
        return this.items;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getReorderPending() {
        return this.reorderPending;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getAnimateItemPlacement() {
        return this.animateItemPlacement;
    }

    public final PositionsListDataState copy(PositionsLocation positionsLocation, PositionInstrumentType positionInstrumentType, String selectedDisplayType, PositionsDisplayOptions displayOptions, UIComponent<? extends AccountPositionAction> header, UIComponent<? extends AccountPositionAction> footer, ImmutableList<PositionsV2.PositionListItemV2> items, boolean reorderPending, boolean animateItemPlacement, boolean futuresAssetHomeOpened, boolean hasOpenedEcHub, boolean isInEcShimmerExp) {
        return new PositionsListDataState(positionsLocation, positionInstrumentType, selectedDisplayType, displayOptions, header, footer, items, reorderPending, animateItemPlacement, futuresAssetHomeOpened, hasOpenedEcHub, isInEcShimmerExp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionsListDataState)) {
            return false;
        }
        PositionsListDataState positionsListDataState = (PositionsListDataState) other;
        return this.positionsLocation == positionsListDataState.positionsLocation && this.positionInstrumentType == positionsListDataState.positionInstrumentType && Intrinsics.areEqual(this.selectedDisplayType, positionsListDataState.selectedDisplayType) && Intrinsics.areEqual(this.displayOptions, positionsListDataState.displayOptions) && Intrinsics.areEqual(this.header, positionsListDataState.header) && Intrinsics.areEqual(this.footer, positionsListDataState.footer) && Intrinsics.areEqual(this.items, positionsListDataState.items) && this.reorderPending == positionsListDataState.reorderPending && this.animateItemPlacement == positionsListDataState.animateItemPlacement && this.futuresAssetHomeOpened == positionsListDataState.futuresAssetHomeOpened && this.hasOpenedEcHub == positionsListDataState.hasOpenedEcHub && this.isInEcShimmerExp == positionsListDataState.isInEcShimmerExp;
    }

    public int hashCode() {
        PositionsLocation positionsLocation = this.positionsLocation;
        int iHashCode = (positionsLocation == null ? 0 : positionsLocation.hashCode()) * 31;
        PositionInstrumentType positionInstrumentType = this.positionInstrumentType;
        int iHashCode2 = (iHashCode + (positionInstrumentType == null ? 0 : positionInstrumentType.hashCode())) * 31;
        String str = this.selectedDisplayType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PositionsDisplayOptions positionsDisplayOptions = this.displayOptions;
        int iHashCode4 = (iHashCode3 + (positionsDisplayOptions == null ? 0 : positionsDisplayOptions.hashCode())) * 31;
        UIComponent<AccountPositionAction> uIComponent = this.header;
        int iHashCode5 = (iHashCode4 + (uIComponent == null ? 0 : uIComponent.hashCode())) * 31;
        UIComponent<AccountPositionAction> uIComponent2 = this.footer;
        int iHashCode6 = (iHashCode5 + (uIComponent2 == null ? 0 : uIComponent2.hashCode())) * 31;
        ImmutableList<PositionsV2.PositionListItemV2> immutableList = this.items;
        return ((((((((((iHashCode6 + (immutableList != null ? immutableList.hashCode() : 0)) * 31) + Boolean.hashCode(this.reorderPending)) * 31) + Boolean.hashCode(this.animateItemPlacement)) * 31) + Boolean.hashCode(this.futuresAssetHomeOpened)) * 31) + Boolean.hashCode(this.hasOpenedEcHub)) * 31) + Boolean.hashCode(this.isInEcShimmerExp);
    }

    public String toString() {
        return "PositionsListDataState(positionsLocation=" + this.positionsLocation + ", positionInstrumentType=" + this.positionInstrumentType + ", selectedDisplayType=" + this.selectedDisplayType + ", displayOptions=" + this.displayOptions + ", header=" + this.header + ", footer=" + this.footer + ", items=" + this.items + ", reorderPending=" + this.reorderPending + ", animateItemPlacement=" + this.animateItemPlacement + ", futuresAssetHomeOpened=" + this.futuresAssetHomeOpened + ", hasOpenedEcHub=" + this.hasOpenedEcHub + ", isInEcShimmerExp=" + this.isInEcShimmerExp + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PositionsListDataState(PositionsLocation positionsLocation, PositionInstrumentType positionInstrumentType, String str, PositionsDisplayOptions positionsDisplayOptions, UIComponent<? extends AccountPositionAction> uIComponent, UIComponent<? extends AccountPositionAction> uIComponent2, ImmutableList<PositionsV2.PositionListItemV2> immutableList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.positionsLocation = positionsLocation;
        this.positionInstrumentType = positionInstrumentType;
        this.selectedDisplayType = str;
        this.displayOptions = positionsDisplayOptions;
        this.header = uIComponent;
        this.footer = uIComponent2;
        this.items = immutableList;
        this.reorderPending = z;
        this.animateItemPlacement = z2;
        this.futuresAssetHomeOpened = z3;
        this.hasOpenedEcHub = z4;
        this.isInEcShimmerExp = z5;
    }

    public /* synthetic */ PositionsListDataState(PositionsLocation positionsLocation, PositionInstrumentType positionInstrumentType, String str, PositionsDisplayOptions positionsDisplayOptions, UIComponent uIComponent, UIComponent uIComponent2, ImmutableList immutableList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : positionsLocation, (i & 2) != 0 ? null : positionInstrumentType, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : positionsDisplayOptions, (i & 16) != 0 ? null : uIComponent, (i & 32) != 0 ? null : uIComponent2, (i & 64) != 0 ? null : immutableList, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? false : z5);
    }

    public final PositionsLocation getPositionsLocation() {
        return this.positionsLocation;
    }

    public final PositionInstrumentType getPositionInstrumentType() {
        return this.positionInstrumentType;
    }

    public final String getSelectedDisplayType() {
        return this.selectedDisplayType;
    }

    public final PositionsDisplayOptions getDisplayOptions() {
        return this.displayOptions;
    }

    public final UIComponent<AccountPositionAction> getHeader() {
        return this.header;
    }

    public final UIComponent<AccountPositionAction> getFooter() {
        return this.footer;
    }

    public final ImmutableList<PositionsV2.PositionListItemV2> getItems() {
        return this.items;
    }

    public final boolean getReorderPending() {
        return this.reorderPending;
    }

    public final boolean getAnimateItemPlacement() {
        return this.animateItemPlacement;
    }

    public final boolean getFuturesAssetHomeOpened() {
        return this.futuresAssetHomeOpened;
    }

    public final boolean getHasOpenedEcHub() {
        return this.hasOpenedEcHub;
    }

    public final boolean isInEcShimmerExp() {
        return this.isInEcShimmerExp;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean getShouldHeaderShimmer() {
        PositionInstrumentType positionInstrumentType = this.positionInstrumentType;
        switch (positionInstrumentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[positionInstrumentType.ordinal()]) {
            case -1:
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
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
                if (this.positionsLocation == PositionsLocation.HOME_TAB && !this.futuresAssetHomeOpened && !(this.header instanceof MarkdownText)) {
                    return true;
                }
                break;
            case 3:
            case 4:
                return this.positionsLocation == PositionsLocation.HOME_TAB && !this.hasOpenedEcHub && this.isInEcShimmerExp;
        }
    }
}
