package com.robinhood.shared.recurring.p392ui.amountentry;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.compose.bento.component.numpad.BentoNumpadState;
import com.robinhood.shared.crypto.p375ui.amountInputView.CryptoAmountInputState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringAmountEntryComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/recurring/ui/amountentry/RecurringAmountEntryState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "amount", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputState;", "buyingPower", "numpadState", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadState;", "bottomSheetDescription", "navigationType", "Lcom/robinhood/android/navigation/NavigationType;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputState;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadState;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/navigation/NavigationType;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getAmount", "()Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputState;", "getBuyingPower", "getNumpadState", "()Lcom/robinhood/compose/bento/component/numpad/BentoNumpadState;", "getBottomSheetDescription", "getNavigationType", "()Lcom/robinhood/android/navigation/NavigationType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-recurring-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RecurringAmountEntryState {
    public static final int $stable;
    private final CryptoAmountInputState amount;
    private final StringResource bottomSheetDescription;
    private final StringResource buyingPower;
    private final NavigationType navigationType;
    private final BentoNumpadState numpadState;
    private final StringResource subtitle;
    private final StringResource title;

    static {
        int i = StringResource.$stable;
        $stable = i | BentoNumpadState.$stable | i | i | CryptoAmountInputState.$stable | i;
    }

    public static /* synthetic */ RecurringAmountEntryState copy$default(RecurringAmountEntryState recurringAmountEntryState, StringResource stringResource, StringResource stringResource2, CryptoAmountInputState cryptoAmountInputState, StringResource stringResource3, BentoNumpadState bentoNumpadState, StringResource stringResource4, NavigationType navigationType, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = recurringAmountEntryState.title;
        }
        if ((i & 2) != 0) {
            stringResource2 = recurringAmountEntryState.subtitle;
        }
        if ((i & 4) != 0) {
            cryptoAmountInputState = recurringAmountEntryState.amount;
        }
        if ((i & 8) != 0) {
            stringResource3 = recurringAmountEntryState.buyingPower;
        }
        if ((i & 16) != 0) {
            bentoNumpadState = recurringAmountEntryState.numpadState;
        }
        if ((i & 32) != 0) {
            stringResource4 = recurringAmountEntryState.bottomSheetDescription;
        }
        if ((i & 64) != 0) {
            navigationType = recurringAmountEntryState.navigationType;
        }
        StringResource stringResource5 = stringResource4;
        NavigationType navigationType2 = navigationType;
        BentoNumpadState bentoNumpadState2 = bentoNumpadState;
        CryptoAmountInputState cryptoAmountInputState2 = cryptoAmountInputState;
        return recurringAmountEntryState.copy(stringResource, stringResource2, cryptoAmountInputState2, stringResource3, bentoNumpadState2, stringResource5, navigationType2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoAmountInputState getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getBuyingPower() {
        return this.buyingPower;
    }

    /* renamed from: component5, reason: from getter */
    public final BentoNumpadState getNumpadState() {
        return this.numpadState;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getBottomSheetDescription() {
        return this.bottomSheetDescription;
    }

    /* renamed from: component7, reason: from getter */
    public final NavigationType getNavigationType() {
        return this.navigationType;
    }

    public final RecurringAmountEntryState copy(StringResource title, StringResource subtitle, CryptoAmountInputState amount, StringResource buyingPower, BentoNumpadState numpadState, StringResource bottomSheetDescription, NavigationType navigationType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        Intrinsics.checkNotNullParameter(bottomSheetDescription, "bottomSheetDescription");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        return new RecurringAmountEntryState(title, subtitle, amount, buyingPower, numpadState, bottomSheetDescription, navigationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringAmountEntryState)) {
            return false;
        }
        RecurringAmountEntryState recurringAmountEntryState = (RecurringAmountEntryState) other;
        return Intrinsics.areEqual(this.title, recurringAmountEntryState.title) && Intrinsics.areEqual(this.subtitle, recurringAmountEntryState.subtitle) && Intrinsics.areEqual(this.amount, recurringAmountEntryState.amount) && Intrinsics.areEqual(this.buyingPower, recurringAmountEntryState.buyingPower) && Intrinsics.areEqual(this.numpadState, recurringAmountEntryState.numpadState) && Intrinsics.areEqual(this.bottomSheetDescription, recurringAmountEntryState.bottomSheetDescription) && this.navigationType == recurringAmountEntryState.navigationType;
    }

    public int hashCode() {
        return (((((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.buyingPower.hashCode()) * 31) + this.numpadState.hashCode()) * 31) + this.bottomSheetDescription.hashCode()) * 31) + this.navigationType.hashCode();
    }

    public String toString() {
        return "RecurringAmountEntryState(title=" + this.title + ", subtitle=" + this.subtitle + ", amount=" + this.amount + ", buyingPower=" + this.buyingPower + ", numpadState=" + this.numpadState + ", bottomSheetDescription=" + this.bottomSheetDescription + ", navigationType=" + this.navigationType + ")";
    }

    public RecurringAmountEntryState(StringResource title, StringResource subtitle, CryptoAmountInputState amount, StringResource buyingPower, BentoNumpadState numpadState, StringResource bottomSheetDescription, NavigationType navigationType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        Intrinsics.checkNotNullParameter(bottomSheetDescription, "bottomSheetDescription");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        this.title = title;
        this.subtitle = subtitle;
        this.amount = amount;
        this.buyingPower = buyingPower;
        this.numpadState = numpadState;
        this.bottomSheetDescription = bottomSheetDescription;
        this.navigationType = navigationType;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final CryptoAmountInputState getAmount() {
        return this.amount;
    }

    public final StringResource getBuyingPower() {
        return this.buyingPower;
    }

    public final BentoNumpadState getNumpadState() {
        return this.numpadState;
    }

    public final StringResource getBottomSheetDescription() {
        return this.bottomSheetDescription;
    }

    public final NavigationType getNavigationType() {
        return this.navigationType;
    }
}
