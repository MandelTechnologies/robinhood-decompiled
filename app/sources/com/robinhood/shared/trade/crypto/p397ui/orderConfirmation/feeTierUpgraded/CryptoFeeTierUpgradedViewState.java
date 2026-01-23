package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeTierUpgradedViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u0011\u0010%\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fHÆ\u0003Ji\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedViewState;", "", "feeRatesSection", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection;", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "descriptionText", "helperText", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedViewState$PrimaryButton;", "isContentLoading", "", "showError", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedViewState$PrimaryButton;ZZLcom/robinhood/rosetta/eventlogging/Context;)V", "getFeeRatesSection", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection;", "getTitleText", "()Lcom/robinhood/utils/resource/StringResource;", "getDescriptionText", "getHelperText", "getPrimaryButton", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedViewState$PrimaryButton;", "()Z", "getShowError", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "PrimaryButton", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoFeeTierUpgradedViewState {
    public static final int $stable = 8;
    private final StringResource descriptionText;
    private final Context eventContext;
    private final CryptoFeeTierUpgradedViewState2 feeRatesSection;
    private final StringResource helperText;
    private final boolean isContentLoading;
    private final PrimaryButton primaryButton;
    private final boolean showError;
    private final StringResource titleText;

    public static /* synthetic */ CryptoFeeTierUpgradedViewState copy$default(CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState, CryptoFeeTierUpgradedViewState2 cryptoFeeTierUpgradedViewState2, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, PrimaryButton primaryButton, boolean z, boolean z2, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoFeeTierUpgradedViewState2 = cryptoFeeTierUpgradedViewState.feeRatesSection;
        }
        if ((i & 2) != 0) {
            stringResource = cryptoFeeTierUpgradedViewState.titleText;
        }
        if ((i & 4) != 0) {
            stringResource2 = cryptoFeeTierUpgradedViewState.descriptionText;
        }
        if ((i & 8) != 0) {
            stringResource3 = cryptoFeeTierUpgradedViewState.helperText;
        }
        if ((i & 16) != 0) {
            primaryButton = cryptoFeeTierUpgradedViewState.primaryButton;
        }
        if ((i & 32) != 0) {
            z = cryptoFeeTierUpgradedViewState.isContentLoading;
        }
        if ((i & 64) != 0) {
            z2 = cryptoFeeTierUpgradedViewState.showError;
        }
        if ((i & 128) != 0) {
            context = cryptoFeeTierUpgradedViewState.eventContext;
        }
        boolean z3 = z2;
        Context context2 = context;
        PrimaryButton primaryButton2 = primaryButton;
        boolean z4 = z;
        return cryptoFeeTierUpgradedViewState.copy(cryptoFeeTierUpgradedViewState2, stringResource, stringResource2, stringResource3, primaryButton2, z4, z3, context2);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoFeeTierUpgradedViewState2 getFeeRatesSection() {
        return this.feeRatesSection;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getTitleText() {
        return this.titleText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getDescriptionText() {
        return this.descriptionText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getHelperText() {
        return this.helperText;
    }

    /* renamed from: component5, reason: from getter */
    public final PrimaryButton getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsContentLoading() {
        return this.isContentLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowError() {
        return this.showError;
    }

    /* renamed from: component8, reason: from getter */
    public final Context getEventContext() {
        return this.eventContext;
    }

    public final CryptoFeeTierUpgradedViewState copy(CryptoFeeTierUpgradedViewState2 feeRatesSection, StringResource titleText, StringResource descriptionText, StringResource helperText, PrimaryButton primaryButton, boolean isContentLoading, boolean showError, Context eventContext) {
        Intrinsics.checkNotNullParameter(feeRatesSection, "feeRatesSection");
        return new CryptoFeeTierUpgradedViewState(feeRatesSection, titleText, descriptionText, helperText, primaryButton, isContentLoading, showError, eventContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoFeeTierUpgradedViewState)) {
            return false;
        }
        CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState = (CryptoFeeTierUpgradedViewState) other;
        return Intrinsics.areEqual(this.feeRatesSection, cryptoFeeTierUpgradedViewState.feeRatesSection) && Intrinsics.areEqual(this.titleText, cryptoFeeTierUpgradedViewState.titleText) && Intrinsics.areEqual(this.descriptionText, cryptoFeeTierUpgradedViewState.descriptionText) && Intrinsics.areEqual(this.helperText, cryptoFeeTierUpgradedViewState.helperText) && this.primaryButton == cryptoFeeTierUpgradedViewState.primaryButton && this.isContentLoading == cryptoFeeTierUpgradedViewState.isContentLoading && this.showError == cryptoFeeTierUpgradedViewState.showError && Intrinsics.areEqual(this.eventContext, cryptoFeeTierUpgradedViewState.eventContext);
    }

    public int hashCode() {
        int iHashCode = this.feeRatesSection.hashCode() * 31;
        StringResource stringResource = this.titleText;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.descriptionText;
        int iHashCode3 = (iHashCode2 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        StringResource stringResource3 = this.helperText;
        int iHashCode4 = (iHashCode3 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
        PrimaryButton primaryButton = this.primaryButton;
        int iHashCode5 = (((((iHashCode4 + (primaryButton == null ? 0 : primaryButton.hashCode())) * 31) + Boolean.hashCode(this.isContentLoading)) * 31) + Boolean.hashCode(this.showError)) * 31;
        Context context = this.eventContext;
        return iHashCode5 + (context != null ? context.hashCode() : 0);
    }

    public String toString() {
        return "CryptoFeeTierUpgradedViewState(feeRatesSection=" + this.feeRatesSection + ", titleText=" + this.titleText + ", descriptionText=" + this.descriptionText + ", helperText=" + this.helperText + ", primaryButton=" + this.primaryButton + ", isContentLoading=" + this.isContentLoading + ", showError=" + this.showError + ", eventContext=" + this.eventContext + ")";
    }

    public CryptoFeeTierUpgradedViewState(CryptoFeeTierUpgradedViewState2 feeRatesSection, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, PrimaryButton primaryButton, boolean z, boolean z2, Context context) {
        Intrinsics.checkNotNullParameter(feeRatesSection, "feeRatesSection");
        this.feeRatesSection = feeRatesSection;
        this.titleText = stringResource;
        this.descriptionText = stringResource2;
        this.helperText = stringResource3;
        this.primaryButton = primaryButton;
        this.isContentLoading = z;
        this.showError = z2;
        this.eventContext = context;
    }

    public final CryptoFeeTierUpgradedViewState2 getFeeRatesSection() {
        return this.feeRatesSection;
    }

    public final StringResource getTitleText() {
        return this.titleText;
    }

    public final StringResource getDescriptionText() {
        return this.descriptionText;
    }

    public final StringResource getHelperText() {
        return this.helperText;
    }

    public final PrimaryButton getPrimaryButton() {
        return this.primaryButton;
    }

    public final boolean isContentLoading() {
        return this.isContentLoading;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public final Context getEventContext() {
        return this.eventContext;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoFeeTierUpgradedViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedViewState$PrimaryButton;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "identifier", "", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getIdentifier", "()Ljava/lang/String;", "DONE", "CONTINUE", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PrimaryButton {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PrimaryButton[] $VALUES;
        public static final PrimaryButton CONTINUE;
        public static final PrimaryButton DONE;
        private final String identifier;
        private final StringResource text;

        private static final /* synthetic */ PrimaryButton[] $values() {
            return new PrimaryButton[]{DONE, CONTINUE};
        }

        public static EnumEntries<PrimaryButton> getEntries() {
            return $ENTRIES;
        }

        private PrimaryButton(String str, int i, StringResource stringResource, String str2) {
            this.text = stringResource;
            this.identifier = str2;
        }

        public final StringResource getText() {
            return this.text;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        static {
            StringResource.Companion companion = StringResource.INSTANCE;
            DONE = new PrimaryButton("DONE", 0, companion.invoke(C40095R.string.crypto_order_confirmation_fee_tier_upgraded_primary_cta_done, new Object[0]), "done");
            CONTINUE = new PrimaryButton("CONTINUE", 1, companion.invoke(C40095R.string.crypto_order_confirmation_fee_tier_upgraded_primary_cta_continue, new Object[0]), "continue");
            PrimaryButton[] primaryButtonArr$values = $values();
            $VALUES = primaryButtonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(primaryButtonArr$values);
        }

        public static PrimaryButton valueOf(String str) {
            return (PrimaryButton) Enum.valueOf(PrimaryButton.class, str);
        }

        public static PrimaryButton[] values() {
            return (PrimaryButton[]) $VALUES.clone();
        }
    }
}
