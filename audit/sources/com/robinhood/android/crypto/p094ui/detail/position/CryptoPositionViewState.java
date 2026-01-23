package com.robinhood.android.crypto.p094ui.detail.position;

import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionDataState;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionState;
import com.robinhood.android.crypto.p094ui.detail.position.views.CryptoPositionRowState;
import com.robinhood.android.crypto.p094ui.view.CryptoDetailTransferActionState;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.crypto.p314db.CryptoPositionDetails;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoPositionViewState.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010#\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010<\u001a\u00020\nHÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J\t\u0010>\u001a\u00020\nHÂ\u0003J\t\u0010?\u001a\u00020\u000eHÂ\u0003J\t\u0010@\u001a\u00020\u0010HÂ\u0003J\t\u0010A\u001a\u00020\u000eHÂ\u0003J\t\u0010B\u001a\u00020\nHÂ\u0003J\t\u0010C\u001a\u00020\nHÂ\u0003J\t\u0010D\u001a\u00020\u000eHÂ\u0003J\t\u0010E\u001a\u00020\u000eHÂ\u0003J\t\u0010F\u001a\u00020\u0017HÂ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0019HÂ\u0003J\t\u0010H\u001a\u00020\u0017HÂ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0019HÂ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u001dHÂ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001fHÂ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010!HÂ\u0003J\t\u0010M\u001a\u00020\nHÂ\u0003J\t\u0010N\u001a\u00020$HÆ\u0003Jû\u0001\u0010O\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020$HÆ\u0001J\u0013\u0010P\u001a\u00020\n2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020SHÖ\u0001J\t\u0010T\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010-R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010-R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u0002018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u000e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u000e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00106¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionViewState;", "", "amountAvailableInfoScreen", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "currencyPairId", "Ljava/util/UUID;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "isRhc", "", "isVisible", "areHoldingRowsVisible", "averageCost", "Landroidx/compose/ui/text/AnnotatedString;", "diversityPercentage", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY, "isCryptoBalanceIconVisible", "isPortfolioDiversityRowVisible", "portfolioDiversity", "quantity", "todaysReturn", "", "todaysReturnPercentage", "Ljava/math/BigDecimal;", "totalReturn", "totalReturnPercentage", "transferActionState", "Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;", "averageCostTotalReturnStatus", "Lcom/robinhood/models/crypto/db/CryptoPositionDetails$AverageCostTotalReturnStatus;", "positionBannerType", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;", "shouldDisplayAvgCostReturnOptimizedTooltip", "passThrough", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState$PassThrough;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Screen;ZZZLandroidx/compose/ui/text/AnnotatedString;FLandroidx/compose/ui/text/AnnotatedString;ZZLandroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/android/crypto/ui/view/CryptoDetailTransferActionState;Lcom/robinhood/models/crypto/db/CryptoPositionDetails$AverageCostTotalReturnStatus;Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;ZLcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState$PassThrough;)V", "getAmountAvailableInfoScreen", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getCurrencyPairId", "()Ljava/util/UUID;", "getLoggingScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "()Z", "getPassThrough", "()Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionDataState$PassThrough;", "cryptoPositionState", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState;", "getCryptoPositionState", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState;", "todaysReturnString", "getTodaysReturnString", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "totalReturnString", "getTotalReturnString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoPositionViewState {
    public static final int $stable = 8;
    private final GenericAlertContent<GenericAction> amountAvailableInfoScreen;
    private final boolean areHoldingRowsVisible;
    private final AnnotatedString averageCost;
    private final CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus;
    private final UUID currencyPairId;
    private final float diversityPercentage;
    private final AnnotatedString equity;
    private final boolean isCryptoBalanceIconVisible;
    private final boolean isPortfolioDiversityRowVisible;
    private final boolean isRhc;
    private final boolean isVisible;
    private final Screen loggingScreen;
    private final CryptoPositionDataState.PassThrough passThrough;
    private final AnnotatedString portfolioDiversity;
    private final CryptoPositionState.PositionBannerType positionBannerType;
    private final AnnotatedString quantity;
    private final boolean shouldDisplayAvgCostReturnOptimizedTooltip;
    private final String todaysReturn;
    private final BigDecimal todaysReturnPercentage;
    private final String totalReturn;
    private final BigDecimal totalReturnPercentage;
    private final CryptoDetailTransferActionState transferActionState;

    /* compiled from: CryptoPositionViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoPositionDetails.AverageCostTotalReturnStatus.values().length];
            try {
                iArr[CryptoPositionDetails.AverageCostTotalReturnStatus.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoPositionDetails.AverageCostTotalReturnStatus.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoPositionDetails.AverageCostTotalReturnStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component10, reason: from getter */
    private final boolean getIsCryptoBalanceIconVisible() {
        return this.isCryptoBalanceIconVisible;
    }

    /* renamed from: component11, reason: from getter */
    private final boolean getIsPortfolioDiversityRowVisible() {
        return this.isPortfolioDiversityRowVisible;
    }

    /* renamed from: component12, reason: from getter */
    private final AnnotatedString getPortfolioDiversity() {
        return this.portfolioDiversity;
    }

    /* renamed from: component13, reason: from getter */
    private final AnnotatedString getQuantity() {
        return this.quantity;
    }

    /* renamed from: component14, reason: from getter */
    private final String getTodaysReturn() {
        return this.todaysReturn;
    }

    /* renamed from: component15, reason: from getter */
    private final BigDecimal getTodaysReturnPercentage() {
        return this.todaysReturnPercentage;
    }

    /* renamed from: component16, reason: from getter */
    private final String getTotalReturn() {
        return this.totalReturn;
    }

    /* renamed from: component17, reason: from getter */
    private final BigDecimal getTotalReturnPercentage() {
        return this.totalReturnPercentage;
    }

    /* renamed from: component18, reason: from getter */
    private final CryptoDetailTransferActionState getTransferActionState() {
        return this.transferActionState;
    }

    /* renamed from: component19, reason: from getter */
    private final CryptoPositionDetails.AverageCostTotalReturnStatus getAverageCostTotalReturnStatus() {
        return this.averageCostTotalReturnStatus;
    }

    /* renamed from: component20, reason: from getter */
    private final CryptoPositionState.PositionBannerType getPositionBannerType() {
        return this.positionBannerType;
    }

    /* renamed from: component21, reason: from getter */
    private final boolean getShouldDisplayAvgCostReturnOptimizedTooltip() {
        return this.shouldDisplayAvgCostReturnOptimizedTooltip;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getAreHoldingRowsVisible() {
        return this.areHoldingRowsVisible;
    }

    /* renamed from: component7, reason: from getter */
    private final AnnotatedString getAverageCost() {
        return this.averageCost;
    }

    /* renamed from: component8, reason: from getter */
    private final float getDiversityPercentage() {
        return this.diversityPercentage;
    }

    /* renamed from: component9, reason: from getter */
    private final AnnotatedString getEquity() {
        return this.equity;
    }

    public static /* synthetic */ CryptoPositionViewState copy$default(CryptoPositionViewState cryptoPositionViewState, GenericAlertContent genericAlertContent, UUID uuid, Screen screen, boolean z, boolean z2, boolean z3, AnnotatedString annotatedString, float f, AnnotatedString annotatedString2, boolean z4, boolean z5, AnnotatedString annotatedString3, AnnotatedString annotatedString4, String str, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, CryptoDetailTransferActionState cryptoDetailTransferActionsComposable, CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus, CryptoPositionState.PositionBannerType positionBannerType, boolean z6, CryptoPositionDataState.PassThrough passThrough, int i, Object obj) {
        CryptoPositionDataState.PassThrough passThrough2;
        boolean z7;
        GenericAlertContent genericAlertContent2 = (i & 1) != 0 ? cryptoPositionViewState.amountAvailableInfoScreen : genericAlertContent;
        UUID uuid2 = (i & 2) != 0 ? cryptoPositionViewState.currencyPairId : uuid;
        Screen screen2 = (i & 4) != 0 ? cryptoPositionViewState.loggingScreen : screen;
        boolean z8 = (i & 8) != 0 ? cryptoPositionViewState.isRhc : z;
        boolean z9 = (i & 16) != 0 ? cryptoPositionViewState.isVisible : z2;
        boolean z10 = (i & 32) != 0 ? cryptoPositionViewState.areHoldingRowsVisible : z3;
        AnnotatedString annotatedString5 = (i & 64) != 0 ? cryptoPositionViewState.averageCost : annotatedString;
        float f2 = (i & 128) != 0 ? cryptoPositionViewState.diversityPercentage : f;
        AnnotatedString annotatedString6 = (i & 256) != 0 ? cryptoPositionViewState.equity : annotatedString2;
        boolean z11 = (i & 512) != 0 ? cryptoPositionViewState.isCryptoBalanceIconVisible : z4;
        boolean z12 = (i & 1024) != 0 ? cryptoPositionViewState.isPortfolioDiversityRowVisible : z5;
        AnnotatedString annotatedString7 = (i & 2048) != 0 ? cryptoPositionViewState.portfolioDiversity : annotatedString3;
        AnnotatedString annotatedString8 = (i & 4096) != 0 ? cryptoPositionViewState.quantity : annotatedString4;
        String str3 = (i & 8192) != 0 ? cryptoPositionViewState.todaysReturn : str;
        GenericAlertContent genericAlertContent3 = genericAlertContent2;
        BigDecimal bigDecimal3 = (i & 16384) != 0 ? cryptoPositionViewState.todaysReturnPercentage : bigDecimal;
        String str4 = (i & 32768) != 0 ? cryptoPositionViewState.totalReturn : str2;
        BigDecimal bigDecimal4 = (i & 65536) != 0 ? cryptoPositionViewState.totalReturnPercentage : bigDecimal2;
        CryptoDetailTransferActionState cryptoDetailTransferActionsComposable2 = (i & 131072) != 0 ? cryptoPositionViewState.transferActionState : cryptoDetailTransferActionsComposable;
        CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus2 = (i & 262144) != 0 ? cryptoPositionViewState.averageCostTotalReturnStatus : averageCostTotalReturnStatus;
        CryptoPositionState.PositionBannerType positionBannerType2 = (i & 524288) != 0 ? cryptoPositionViewState.positionBannerType : positionBannerType;
        boolean z13 = (i & 1048576) != 0 ? cryptoPositionViewState.shouldDisplayAvgCostReturnOptimizedTooltip : z6;
        if ((i & 2097152) != 0) {
            z7 = z13;
            passThrough2 = cryptoPositionViewState.passThrough;
        } else {
            passThrough2 = passThrough;
            z7 = z13;
        }
        return cryptoPositionViewState.copy(genericAlertContent3, uuid2, screen2, z8, z9, z10, annotatedString5, f2, annotatedString6, z11, z12, annotatedString7, annotatedString8, str3, bigDecimal3, str4, bigDecimal4, cryptoDetailTransferActionsComposable2, averageCostTotalReturnStatus2, positionBannerType2, z7, passThrough2);
    }

    public final GenericAlertContent<GenericAction> component1() {
        return this.amountAvailableInfoScreen;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component22, reason: from getter */
    public final CryptoPositionDataState.PassThrough getPassThrough() {
        return this.passThrough;
    }

    /* renamed from: component3, reason: from getter */
    public final Screen getLoggingScreen() {
        return this.loggingScreen;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRhc() {
        return this.isRhc;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final CryptoPositionViewState copy(GenericAlertContent<? extends GenericAction> amountAvailableInfoScreen, UUID currencyPairId, Screen loggingScreen, boolean isRhc, boolean isVisible, boolean areHoldingRowsVisible, AnnotatedString averageCost, float diversityPercentage, AnnotatedString equity, boolean isCryptoBalanceIconVisible, boolean isPortfolioDiversityRowVisible, AnnotatedString portfolioDiversity, AnnotatedString quantity, String todaysReturn, BigDecimal todaysReturnPercentage, String totalReturn, BigDecimal totalReturnPercentage, CryptoDetailTransferActionState transferActionState, CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus, CryptoPositionState.PositionBannerType positionBannerType, boolean shouldDisplayAvgCostReturnOptimizedTooltip, CryptoPositionDataState.PassThrough passThrough) {
        Intrinsics.checkNotNullParameter(averageCost, "averageCost");
        Intrinsics.checkNotNullParameter(equity, "equity");
        Intrinsics.checkNotNullParameter(portfolioDiversity, "portfolioDiversity");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(todaysReturn, "todaysReturn");
        Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
        Intrinsics.checkNotNullParameter(passThrough, "passThrough");
        return new CryptoPositionViewState(amountAvailableInfoScreen, currencyPairId, loggingScreen, isRhc, isVisible, areHoldingRowsVisible, averageCost, diversityPercentage, equity, isCryptoBalanceIconVisible, isPortfolioDiversityRowVisible, portfolioDiversity, quantity, todaysReturn, todaysReturnPercentage, totalReturn, totalReturnPercentage, transferActionState, averageCostTotalReturnStatus, positionBannerType, shouldDisplayAvgCostReturnOptimizedTooltip, passThrough);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoPositionViewState)) {
            return false;
        }
        CryptoPositionViewState cryptoPositionViewState = (CryptoPositionViewState) other;
        return Intrinsics.areEqual(this.amountAvailableInfoScreen, cryptoPositionViewState.amountAvailableInfoScreen) && Intrinsics.areEqual(this.currencyPairId, cryptoPositionViewState.currencyPairId) && Intrinsics.areEqual(this.loggingScreen, cryptoPositionViewState.loggingScreen) && this.isRhc == cryptoPositionViewState.isRhc && this.isVisible == cryptoPositionViewState.isVisible && this.areHoldingRowsVisible == cryptoPositionViewState.areHoldingRowsVisible && Intrinsics.areEqual(this.averageCost, cryptoPositionViewState.averageCost) && Float.compare(this.diversityPercentage, cryptoPositionViewState.diversityPercentage) == 0 && Intrinsics.areEqual(this.equity, cryptoPositionViewState.equity) && this.isCryptoBalanceIconVisible == cryptoPositionViewState.isCryptoBalanceIconVisible && this.isPortfolioDiversityRowVisible == cryptoPositionViewState.isPortfolioDiversityRowVisible && Intrinsics.areEqual(this.portfolioDiversity, cryptoPositionViewState.portfolioDiversity) && Intrinsics.areEqual(this.quantity, cryptoPositionViewState.quantity) && Intrinsics.areEqual(this.todaysReturn, cryptoPositionViewState.todaysReturn) && Intrinsics.areEqual(this.todaysReturnPercentage, cryptoPositionViewState.todaysReturnPercentage) && Intrinsics.areEqual(this.totalReturn, cryptoPositionViewState.totalReturn) && Intrinsics.areEqual(this.totalReturnPercentage, cryptoPositionViewState.totalReturnPercentage) && Intrinsics.areEqual(this.transferActionState, cryptoPositionViewState.transferActionState) && this.averageCostTotalReturnStatus == cryptoPositionViewState.averageCostTotalReturnStatus && this.positionBannerType == cryptoPositionViewState.positionBannerType && this.shouldDisplayAvgCostReturnOptimizedTooltip == cryptoPositionViewState.shouldDisplayAvgCostReturnOptimizedTooltip && Intrinsics.areEqual(this.passThrough, cryptoPositionViewState.passThrough);
    }

    public int hashCode() {
        GenericAlertContent<GenericAction> genericAlertContent = this.amountAvailableInfoScreen;
        int iHashCode = (genericAlertContent == null ? 0 : genericAlertContent.hashCode()) * 31;
        UUID uuid = this.currencyPairId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        Screen screen = this.loggingScreen;
        int iHashCode3 = (((((((((((((((((((((((iHashCode2 + (screen == null ? 0 : screen.hashCode())) * 31) + Boolean.hashCode(this.isRhc)) * 31) + Boolean.hashCode(this.isVisible)) * 31) + Boolean.hashCode(this.areHoldingRowsVisible)) * 31) + this.averageCost.hashCode()) * 31) + Float.hashCode(this.diversityPercentage)) * 31) + this.equity.hashCode()) * 31) + Boolean.hashCode(this.isCryptoBalanceIconVisible)) * 31) + Boolean.hashCode(this.isPortfolioDiversityRowVisible)) * 31) + this.portfolioDiversity.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.todaysReturn.hashCode()) * 31;
        BigDecimal bigDecimal = this.todaysReturnPercentage;
        int iHashCode4 = (((iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.totalReturn.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.totalReturnPercentage;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        CryptoDetailTransferActionState cryptoDetailTransferActionsComposable = this.transferActionState;
        int iHashCode6 = (iHashCode5 + (cryptoDetailTransferActionsComposable == null ? 0 : cryptoDetailTransferActionsComposable.hashCode())) * 31;
        CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus = this.averageCostTotalReturnStatus;
        int iHashCode7 = (iHashCode6 + (averageCostTotalReturnStatus == null ? 0 : averageCostTotalReturnStatus.hashCode())) * 31;
        CryptoPositionState.PositionBannerType positionBannerType = this.positionBannerType;
        return ((((iHashCode7 + (positionBannerType != null ? positionBannerType.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldDisplayAvgCostReturnOptimizedTooltip)) * 31) + this.passThrough.hashCode();
    }

    public String toString() {
        GenericAlertContent<GenericAction> genericAlertContent = this.amountAvailableInfoScreen;
        UUID uuid = this.currencyPairId;
        Screen screen = this.loggingScreen;
        boolean z = this.isRhc;
        boolean z2 = this.isVisible;
        boolean z3 = this.areHoldingRowsVisible;
        AnnotatedString annotatedString = this.averageCost;
        float f = this.diversityPercentage;
        AnnotatedString annotatedString2 = this.equity;
        boolean z4 = this.isCryptoBalanceIconVisible;
        boolean z5 = this.isPortfolioDiversityRowVisible;
        AnnotatedString annotatedString3 = this.portfolioDiversity;
        AnnotatedString annotatedString4 = this.quantity;
        return "CryptoPositionViewState(amountAvailableInfoScreen=" + genericAlertContent + ", currencyPairId=" + uuid + ", loggingScreen=" + screen + ", isRhc=" + z + ", isVisible=" + z2 + ", areHoldingRowsVisible=" + z3 + ", averageCost=" + ((Object) annotatedString) + ", diversityPercentage=" + f + ", equity=" + ((Object) annotatedString2) + ", isCryptoBalanceIconVisible=" + z4 + ", isPortfolioDiversityRowVisible=" + z5 + ", portfolioDiversity=" + ((Object) annotatedString3) + ", quantity=" + ((Object) annotatedString4) + ", todaysReturn=" + this.todaysReturn + ", todaysReturnPercentage=" + this.todaysReturnPercentage + ", totalReturn=" + this.totalReturn + ", totalReturnPercentage=" + this.totalReturnPercentage + ", transferActionState=" + this.transferActionState + ", averageCostTotalReturnStatus=" + this.averageCostTotalReturnStatus + ", positionBannerType=" + this.positionBannerType + ", shouldDisplayAvgCostReturnOptimizedTooltip=" + this.shouldDisplayAvgCostReturnOptimizedTooltip + ", passThrough=" + this.passThrough + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoPositionViewState(GenericAlertContent<? extends GenericAction> genericAlertContent, UUID uuid, Screen screen, boolean z, boolean z2, boolean z3, AnnotatedString averageCost, float f, AnnotatedString equity, boolean z4, boolean z5, AnnotatedString portfolioDiversity, AnnotatedString quantity, String todaysReturn, BigDecimal bigDecimal, String totalReturn, BigDecimal bigDecimal2, CryptoDetailTransferActionState cryptoDetailTransferActionsComposable, CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus, CryptoPositionState.PositionBannerType positionBannerType, boolean z6, CryptoPositionDataState.PassThrough passThrough) {
        Intrinsics.checkNotNullParameter(averageCost, "averageCost");
        Intrinsics.checkNotNullParameter(equity, "equity");
        Intrinsics.checkNotNullParameter(portfolioDiversity, "portfolioDiversity");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(todaysReturn, "todaysReturn");
        Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
        Intrinsics.checkNotNullParameter(passThrough, "passThrough");
        this.amountAvailableInfoScreen = genericAlertContent;
        this.currencyPairId = uuid;
        this.loggingScreen = screen;
        this.isRhc = z;
        this.isVisible = z2;
        this.areHoldingRowsVisible = z3;
        this.averageCost = averageCost;
        this.diversityPercentage = f;
        this.equity = equity;
        this.isCryptoBalanceIconVisible = z4;
        this.isPortfolioDiversityRowVisible = z5;
        this.portfolioDiversity = portfolioDiversity;
        this.quantity = quantity;
        this.todaysReturn = todaysReturn;
        this.todaysReturnPercentage = bigDecimal;
        this.totalReturn = totalReturn;
        this.totalReturnPercentage = bigDecimal2;
        this.transferActionState = cryptoDetailTransferActionsComposable;
        this.averageCostTotalReturnStatus = averageCostTotalReturnStatus;
        this.positionBannerType = positionBannerType;
        this.shouldDisplayAvgCostReturnOptimizedTooltip = z6;
        this.passThrough = passThrough;
    }

    public /* synthetic */ CryptoPositionViewState(GenericAlertContent genericAlertContent, UUID uuid, Screen screen, boolean z, boolean z2, boolean z3, AnnotatedString annotatedString, float f, AnnotatedString annotatedString2, boolean z4, boolean z5, AnnotatedString annotatedString3, AnnotatedString annotatedString4, String str, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, CryptoDetailTransferActionState cryptoDetailTransferActionsComposable, CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus, CryptoPositionState.PositionBannerType positionBannerType, boolean z6, CryptoPositionDataState.PassThrough passThrough, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : genericAlertContent, uuid, screen, z, z2, z3, annotatedString, f, annotatedString2, z4, z5, annotatedString3, annotatedString4, str, bigDecimal, str2, bigDecimal2, cryptoDetailTransferActionsComposable, averageCostTotalReturnStatus, positionBannerType, z6, passThrough);
    }

    public final GenericAlertContent<GenericAction> getAmountAvailableInfoScreen() {
        return this.amountAvailableInfoScreen;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final Screen getLoggingScreen() {
        return this.loggingScreen;
    }

    public final boolean isRhc() {
        return this.isRhc;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final CryptoPositionDataState.PassThrough getPassThrough() {
        return this.passThrough;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmName
    public final CryptoPositionState getCryptoPositionState(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179747481, i, -1, "com.robinhood.android.crypto.ui.detail.position.CryptoPositionViewState.<get-cryptoPositionState> (CryptoPositionViewState.kt:54)");
        }
        boolean z = this.isRhc;
        boolean z2 = this.areHoldingRowsVisible;
        boolean z3 = !z;
        AnnotatedString annotatedString = this.equity;
        boolean z4 = this.isCryptoBalanceIconVisible;
        boolean z5 = this.isPortfolioDiversityRowVisible;
        AnnotatedString annotatedString2 = this.quantity;
        CryptoDetailTransferActionState cryptoDetailTransferActionsComposable = this.transferActionState;
        StringResource.Companion companion = StringResource.INSTANCE;
        CryptoPositionRowState cryptoPositionRow4 = new CryptoPositionRowState(false, companion.invoke(C12757R.string.crypto_detail_quantity_label, new Object[0]), false, this.quantity, null, null, "", 52, null);
        CryptoPositionRowState cryptoPositionRow42 = new CryptoPositionRowState(false, companion.invoke(C12757R.string.crypto_detail_value_label, new Object[0]), false, this.equity, 0 == true ? 1 : 0, null, "", 52, null);
        int i2 = i & 14;
        CryptoPositionState cryptoPositionState = new CryptoPositionState(z, z2, z3, annotatedString, z4, z5, annotatedString2, cryptoDetailTransferActionsComposable, true, cryptoPositionRow4, cryptoPositionRow42, new CryptoPositionRowState(false, companion.invoke(C12757R.string.crypto_detail_positions_cost_label, new Object[0]), !this.isRhc, this.averageCost, null, this.shouldDisplayAvgCostReturnOptimizedTooltip ? CryptoPositionRowState.TooltipType.OptimizedCostReturnCalculations.INSTANCE : null, "average_cost", 16, null), new CryptoPositionRowState(false, companion.invoke(C12757R.string.crypto_detail_positions_diversity_label, new Object[0]), !this.isRhc, this.portfolioDiversity, new CryptoPositionRowState.TextTrailingContent.PieChart(this.diversityPercentage), null, "portfolio_diversity", 32, null), new CryptoPositionRowState(true, companion.invoke(C12757R.string.crypto_detail_positions_todays_return_label, new Object[0]), !this.isRhc, getTodaysReturnString(composer, i2), null, null, "today_return", 48, null), new CryptoPositionRowState(true, companion.invoke(C12757R.string.crypto_detail_positions_total_return_label, new Object[0]), !this.isRhc, getTotalReturnString(composer, i2), 0 == true ? 1 : 0, null, AnalyticsStrings.BUTTON_VIEW_MODE_TOTAL_DELTA, 48, null), this.positionBannerType);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cryptoPositionState;
    }

    @JvmName
    private final AnnotatedString getTodaysReturnString(Composer composer, int i) {
        int iPushStyle;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2044541203, i, -1, "com.robinhood.android.crypto.ui.detail.position.CryptoPositionViewState.<get-todaysReturnString> (CryptoPositionViewState.kt:116)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus = this.averageCostTotalReturnStatus;
        int i2 = averageCostTotalReturnStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[averageCostTotalReturnStatus.ordinal()];
        if (i2 == -1) {
            composer.startReplaceGroup(1784942850);
            composer.endReplaceGroup();
            builder.append("");
        } else if (i2 == 1) {
            composer.startReplaceGroup(-502705629);
            iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
            try {
                builder.append(this.todaysReturn);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                if (this.todaysReturnPercentage != null) {
                    iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(" (");
                        builder.append(FormatsLocalized.getSignedPercentFormat().format(this.todaysReturnPercentage));
                        builder.append(")");
                    } finally {
                    }
                }
                composer.endReplaceGroup();
            } finally {
            }
        } else if (i2 == 2) {
            composer.startReplaceGroup(-502152527);
            if (this.todaysReturn.length() == 0 || this.todaysReturnPercentage == null) {
                composer.startReplaceGroup(-502086652);
                builder.append(StringResources_androidKt.stringResource(C12757R.string.crypto_detail_positions_total_return_unavailable_text, composer, 0));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-501937821);
                iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                try {
                    builder.append(this.todaysReturn);
                    Unit unit2 = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(" (");
                        builder.append(FormatsLocalized.getSignedPercentFormat().format(this.todaysReturnPercentage));
                        builder.append(")");
                        builder.pop(iPushStyle);
                        composer.endReplaceGroup();
                    } finally {
                    }
                } finally {
                }
            }
            composer.endReplaceGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceGroup(1784897821);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(1784939467);
            builder.append(StringResources_androidKt.stringResource(C12757R.string.crypto_detail_positions_todays_return_pending_text, composer, 0));
            composer.endReplaceGroup();
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return annotatedString;
    }

    @JvmName
    private final AnnotatedString getTotalReturnString(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(910883383, i, -1, "com.robinhood.android.crypto.ui.detail.position.CryptoPositionViewState.<get-totalReturnString> (CryptoPositionViewState.kt:154)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        CryptoPositionDetails.AverageCostTotalReturnStatus averageCostTotalReturnStatus = this.averageCostTotalReturnStatus;
        int i2 = averageCostTotalReturnStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[averageCostTotalReturnStatus.ordinal()];
        if (i2 == -1) {
            composer.startReplaceGroup(-948974036);
            composer.endReplaceGroup();
            builder.append("");
        } else if (i2 == 1) {
            composer.startReplaceGroup(645806972);
            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
            try {
                builder.append(this.totalReturn);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                if (this.totalReturnPercentage != null) {
                    iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(" (");
                        builder.append(FormatsLocalized.getSignedPercentFormat().format(this.totalReturnPercentage));
                        builder.append(")");
                    } finally {
                    }
                }
                composer.endReplaceGroup();
            } finally {
            }
        } else if (i2 == 2) {
            composer.startReplaceGroup(-948981064);
            builder.append(StringResources_androidKt.stringResource(C12757R.string.crypto_detail_positions_total_return_unavailable_text, composer, 0));
            composer.endReplaceGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceGroup(-949000620);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-948977388);
            builder.append(StringResources_androidKt.stringResource(C12757R.string.crypto_detail_positions_total_return_pending_text, composer, 0));
            composer.endReplaceGroup();
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return annotatedString;
    }
}
