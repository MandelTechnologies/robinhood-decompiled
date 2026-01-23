package com.robinhood.shared.trade.crypto.p397ui.price;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoOrderPriceViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b4J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u0010?\u001a\u00020\u0015HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u009f\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010B\u001a\u00020\u000b2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0013\u0010-\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b.\u0010\u001cR\u0011\u0010/\u001a\u0002008G¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006G"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceViewState;", "", "formattedAmount", "", "cryptoAmountLabel", "Lcom/robinhood/utils/resource/StringResource;", "titleText", "descriptionText", "currentPriceText", "currentPriceValueString", "shouldShowMenu", "", "quoteCurrencyForPrice", "Lcom/robinhood/models/crypto/db/Currency;", "currencySymbolPosition", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "ctaEnabled", "bottomSheetTypeDtos", "Lkotlinx/collections/immutable/ImmutableList;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "numpadState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "formattedHintPrice", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;ZLcom/robinhood/models/crypto/db/Currency;Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;ZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;Lcom/robinhood/utils/resource/StringResource;)V", "getFormattedAmount$feature_trade_crypto_externalDebug", "()Ljava/lang/String;", "getCryptoAmountLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getTitleText", "getDescriptionText", "getCurrentPriceText", "getCurrentPriceValueString", "getShouldShowMenu", "()Z", "getQuoteCurrencyForPrice", "()Lcom/robinhood/models/crypto/db/Currency;", "getCurrencySymbolPosition", "()Lcom/robinhood/shared/common/lib/formats/currency/CurrencyFormatModel$CurrencySymbolPosition;", "getCtaEnabled", "getBottomSheetTypeDtos", "()Lkotlinx/collections/immutable/ImmutableList;", "getNumpadState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "getFormattedHintPrice", "formattedAmountResource", "getFormattedAmountResource", "currentPriceAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "getCurrentPriceAnnotatedString", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "component1", "component1$feature_trade_crypto_externalDebug", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderPriceViewState {
    public static final int $stable = 8;
    private final ImmutableList<BottomSheetTypeDto> bottomSheetTypeDtos;
    private final StringResource cryptoAmountLabel;
    private final boolean ctaEnabled;
    private final CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition;
    private final StringResource currentPriceText;
    private final String currentPriceValueString;
    private final StringResource descriptionText;
    private final String formattedAmount;
    private final StringResource formattedHintPrice;
    private final CryptoOrderAnimatedBentoNumpadState numpadState;
    private final Currency quoteCurrencyForPrice;
    private final boolean shouldShowMenu;
    private final StringResource titleText;

    public static /* synthetic */ CryptoOrderPriceViewState copy$default(CryptoOrderPriceViewState cryptoOrderPriceViewState, String str, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, String str2, boolean z, Currency currency, CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition, boolean z2, ImmutableList immutableList, CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState, StringResource stringResource5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoOrderPriceViewState.formattedAmount;
        }
        return cryptoOrderPriceViewState.copy(str, (i & 2) != 0 ? cryptoOrderPriceViewState.cryptoAmountLabel : stringResource, (i & 4) != 0 ? cryptoOrderPriceViewState.titleText : stringResource2, (i & 8) != 0 ? cryptoOrderPriceViewState.descriptionText : stringResource3, (i & 16) != 0 ? cryptoOrderPriceViewState.currentPriceText : stringResource4, (i & 32) != 0 ? cryptoOrderPriceViewState.currentPriceValueString : str2, (i & 64) != 0 ? cryptoOrderPriceViewState.shouldShowMenu : z, (i & 128) != 0 ? cryptoOrderPriceViewState.quoteCurrencyForPrice : currency, (i & 256) != 0 ? cryptoOrderPriceViewState.currencySymbolPosition : currencySymbolPosition, (i & 512) != 0 ? cryptoOrderPriceViewState.ctaEnabled : z2, (i & 1024) != 0 ? cryptoOrderPriceViewState.bottomSheetTypeDtos : immutableList, (i & 2048) != 0 ? cryptoOrderPriceViewState.numpadState : cryptoOrderAnimatedBentoNumpadState, (i & 4096) != 0 ? cryptoOrderPriceViewState.formattedHintPrice : stringResource5);
    }

    /* renamed from: component1$feature_trade_crypto_externalDebug, reason: from getter */
    public final String getFormattedAmount() {
        return this.formattedAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getCtaEnabled() {
        return this.ctaEnabled;
    }

    public final ImmutableList<BottomSheetTypeDto> component11() {
        return this.bottomSheetTypeDtos;
    }

    /* renamed from: component12, reason: from getter */
    public final CryptoOrderAnimatedBentoNumpadState getNumpadState() {
        return this.numpadState;
    }

    /* renamed from: component13, reason: from getter */
    public final StringResource getFormattedHintPrice() {
        return this.formattedHintPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getCryptoAmountLabel() {
        return this.cryptoAmountLabel;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getTitleText() {
        return this.titleText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getDescriptionText() {
        return this.descriptionText;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getCurrentPriceText() {
        return this.currentPriceText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCurrentPriceValueString() {
        return this.currentPriceValueString;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShouldShowMenu() {
        return this.shouldShowMenu;
    }

    /* renamed from: component8, reason: from getter */
    public final Currency getQuoteCurrencyForPrice() {
        return this.quoteCurrencyForPrice;
    }

    /* renamed from: component9, reason: from getter */
    public final CurrencyFormatModel.CurrencySymbolPosition getCurrencySymbolPosition() {
        return this.currencySymbolPosition;
    }

    public final CryptoOrderPriceViewState copy(String formattedAmount, StringResource cryptoAmountLabel, StringResource titleText, StringResource descriptionText, StringResource currentPriceText, String currentPriceValueString, boolean shouldShowMenu, Currency quoteCurrencyForPrice, CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition, boolean ctaEnabled, ImmutableList<BottomSheetTypeDto> bottomSheetTypeDtos, CryptoOrderAnimatedBentoNumpadState numpadState, StringResource formattedHintPrice) {
        Intrinsics.checkNotNullParameter(cryptoAmountLabel, "cryptoAmountLabel");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(bottomSheetTypeDtos, "bottomSheetTypeDtos");
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        return new CryptoOrderPriceViewState(formattedAmount, cryptoAmountLabel, titleText, descriptionText, currentPriceText, currentPriceValueString, shouldShowMenu, quoteCurrencyForPrice, currencySymbolPosition, ctaEnabled, bottomSheetTypeDtos, numpadState, formattedHintPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderPriceViewState)) {
            return false;
        }
        CryptoOrderPriceViewState cryptoOrderPriceViewState = (CryptoOrderPriceViewState) other;
        return Intrinsics.areEqual(this.formattedAmount, cryptoOrderPriceViewState.formattedAmount) && Intrinsics.areEqual(this.cryptoAmountLabel, cryptoOrderPriceViewState.cryptoAmountLabel) && Intrinsics.areEqual(this.titleText, cryptoOrderPriceViewState.titleText) && Intrinsics.areEqual(this.descriptionText, cryptoOrderPriceViewState.descriptionText) && Intrinsics.areEqual(this.currentPriceText, cryptoOrderPriceViewState.currentPriceText) && Intrinsics.areEqual(this.currentPriceValueString, cryptoOrderPriceViewState.currentPriceValueString) && this.shouldShowMenu == cryptoOrderPriceViewState.shouldShowMenu && Intrinsics.areEqual(this.quoteCurrencyForPrice, cryptoOrderPriceViewState.quoteCurrencyForPrice) && this.currencySymbolPosition == cryptoOrderPriceViewState.currencySymbolPosition && this.ctaEnabled == cryptoOrderPriceViewState.ctaEnabled && Intrinsics.areEqual(this.bottomSheetTypeDtos, cryptoOrderPriceViewState.bottomSheetTypeDtos) && Intrinsics.areEqual(this.numpadState, cryptoOrderPriceViewState.numpadState) && Intrinsics.areEqual(this.formattedHintPrice, cryptoOrderPriceViewState.formattedHintPrice);
    }

    public int hashCode() {
        String str = this.formattedAmount;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.cryptoAmountLabel.hashCode()) * 31) + this.titleText.hashCode()) * 31;
        StringResource stringResource = this.descriptionText;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.currentPriceText;
        int iHashCode3 = (iHashCode2 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        String str2 = this.currentPriceValueString;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.shouldShowMenu)) * 31;
        Currency currency = this.quoteCurrencyForPrice;
        int iHashCode5 = (iHashCode4 + (currency == null ? 0 : currency.hashCode())) * 31;
        CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition = this.currencySymbolPosition;
        int iHashCode6 = (((((((iHashCode5 + (currencySymbolPosition == null ? 0 : currencySymbolPosition.hashCode())) * 31) + Boolean.hashCode(this.ctaEnabled)) * 31) + this.bottomSheetTypeDtos.hashCode()) * 31) + this.numpadState.hashCode()) * 31;
        StringResource stringResource3 = this.formattedHintPrice;
        return iHashCode6 + (stringResource3 != null ? stringResource3.hashCode() : 0);
    }

    public String toString() {
        return "CryptoOrderPriceViewState(formattedAmount=" + this.formattedAmount + ", cryptoAmountLabel=" + this.cryptoAmountLabel + ", titleText=" + this.titleText + ", descriptionText=" + this.descriptionText + ", currentPriceText=" + this.currentPriceText + ", currentPriceValueString=" + this.currentPriceValueString + ", shouldShowMenu=" + this.shouldShowMenu + ", quoteCurrencyForPrice=" + this.quoteCurrencyForPrice + ", currencySymbolPosition=" + this.currencySymbolPosition + ", ctaEnabled=" + this.ctaEnabled + ", bottomSheetTypeDtos=" + this.bottomSheetTypeDtos + ", numpadState=" + this.numpadState + ", formattedHintPrice=" + this.formattedHintPrice + ")";
    }

    public CryptoOrderPriceViewState(String str, StringResource cryptoAmountLabel, StringResource titleText, StringResource stringResource, StringResource stringResource2, String str2, boolean z, Currency currency, CurrencyFormatModel.CurrencySymbolPosition currencySymbolPosition, boolean z2, ImmutableList<BottomSheetTypeDto> bottomSheetTypeDtos, CryptoOrderAnimatedBentoNumpadState numpadState, StringResource stringResource3) {
        Intrinsics.checkNotNullParameter(cryptoAmountLabel, "cryptoAmountLabel");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(bottomSheetTypeDtos, "bottomSheetTypeDtos");
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        this.formattedAmount = str;
        this.cryptoAmountLabel = cryptoAmountLabel;
        this.titleText = titleText;
        this.descriptionText = stringResource;
        this.currentPriceText = stringResource2;
        this.currentPriceValueString = str2;
        this.shouldShowMenu = z;
        this.quoteCurrencyForPrice = currency;
        this.currencySymbolPosition = currencySymbolPosition;
        this.ctaEnabled = z2;
        this.bottomSheetTypeDtos = bottomSheetTypeDtos;
        this.numpadState = numpadState;
        this.formattedHintPrice = stringResource3;
    }

    public final String getFormattedAmount$feature_trade_crypto_externalDebug() {
        return this.formattedAmount;
    }

    public final StringResource getCryptoAmountLabel() {
        return this.cryptoAmountLabel;
    }

    public final StringResource getTitleText() {
        return this.titleText;
    }

    public final StringResource getDescriptionText() {
        return this.descriptionText;
    }

    public final StringResource getCurrentPriceText() {
        return this.currentPriceText;
    }

    public final String getCurrentPriceValueString() {
        return this.currentPriceValueString;
    }

    public final boolean getShouldShowMenu() {
        return this.shouldShowMenu;
    }

    public final Currency getQuoteCurrencyForPrice() {
        return this.quoteCurrencyForPrice;
    }

    public final CurrencyFormatModel.CurrencySymbolPosition getCurrencySymbolPosition() {
        return this.currencySymbolPosition;
    }

    public final boolean getCtaEnabled() {
        return this.ctaEnabled;
    }

    public final ImmutableList<BottomSheetTypeDto> getBottomSheetTypeDtos() {
        return this.bottomSheetTypeDtos;
    }

    public final CryptoOrderAnimatedBentoNumpadState getNumpadState() {
        return this.numpadState;
    }

    public final StringResource getFormattedHintPrice() {
        return this.formattedHintPrice;
    }

    public final StringResource getFormattedAmountResource() {
        String str = this.formattedAmount;
        if (str != null) {
            return StringResource.INSTANCE.invoke(str);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmName
    public final AnnotatedString getCurrentPriceAnnotatedString(Composer composer, int i) throws Resources.NotFoundException {
        composer.startReplaceGroup(788219702);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(788219702, i, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceViewState.<get-currentPriceAnnotatedString> (CryptoOrderPriceViewState.kt:39)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        BentoColors colors = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        StringResource stringResource = this.currentPriceText;
        if (stringResource == null || this.currentPriceValueString == null) {
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return annotatedString;
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence text = stringResource.getText(resources);
        int iIndexOf$default = StringsKt.indexOf$default(text, this.currentPriceValueString, 0, false, 6, (Object) null);
        builder.append(text);
        builder.addStyle(new SpanStyle(Color2.Color(Color2.m6735toArgb8_81llA(colors.m21426getFg20d7_KjU())), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null), 0, text.length());
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        builder.addStyle(new SpanStyle(Color2.Color(Color2.m6735toArgb8_81llA(colors.m21425getFg0d7_KjU())), 0L, FontWeight.INSTANCE.getSemiBold(), (FontStyle) objArr, (FontSynthesis) objArr2, (FontFamily) objArr3, (String) null, 0L, (BaselineShift) objArr4, (TextGeometricTransform) objArr5, (LocaleList) null, 0L, (TextDecoration) objArr6, (Shadow) objArr7, (PlatformSpanStyle) objArr8, (DrawScope2) null, 65530, (DefaultConstructorMarker) null), iIndexOf$default, this.currentPriceValueString.length() + iIndexOf$default);
        AnnotatedString annotatedString2 = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return annotatedString2;
    }
}
