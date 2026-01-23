package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus;

import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeTierStatusViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u0011\u0010(\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010HÆ\u0003Jp\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001dR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusViewState;", "", "currentTierFee", "", "nextTierFee", "currentProgressText", "Lcom/robinhood/utils/resource/StringResource;", "feeTierProgress", "", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusViewState$PrimaryButton;", "isContentLoading", "", "showError", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Float;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusViewState$PrimaryButton;ZZLcom/robinhood/rosetta/eventlogging/Context;)V", "getCurrentTierFee", "()Ljava/lang/String;", "getNextTierFee", "getCurrentProgressText", "()Lcom/robinhood/utils/resource/StringResource;", "getFeeTierProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPrimaryButton", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusViewState$PrimaryButton;", "()Z", "getShowError", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Float;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusViewState$PrimaryButton;ZZLcom/robinhood/rosetta/eventlogging/Context;)Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusViewState;", "equals", "other", "hashCode", "", "toString", "PrimaryButton", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoFeeTierStatusViewState {
    public static final int $stable = 8;
    private final StringResource currentProgressText;
    private final String currentTierFee;
    private final Context eventContext;
    private final Float feeTierProgress;
    private final boolean isContentLoading;
    private final String nextTierFee;
    private final PrimaryButton primaryButton;
    private final boolean showError;

    public static /* synthetic */ CryptoFeeTierStatusViewState copy$default(CryptoFeeTierStatusViewState cryptoFeeTierStatusViewState, String str, String str2, StringResource stringResource, Float f, PrimaryButton primaryButton, boolean z, boolean z2, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoFeeTierStatusViewState.currentTierFee;
        }
        if ((i & 2) != 0) {
            str2 = cryptoFeeTierStatusViewState.nextTierFee;
        }
        if ((i & 4) != 0) {
            stringResource = cryptoFeeTierStatusViewState.currentProgressText;
        }
        if ((i & 8) != 0) {
            f = cryptoFeeTierStatusViewState.feeTierProgress;
        }
        if ((i & 16) != 0) {
            primaryButton = cryptoFeeTierStatusViewState.primaryButton;
        }
        if ((i & 32) != 0) {
            z = cryptoFeeTierStatusViewState.isContentLoading;
        }
        if ((i & 64) != 0) {
            z2 = cryptoFeeTierStatusViewState.showError;
        }
        if ((i & 128) != 0) {
            context = cryptoFeeTierStatusViewState.eventContext;
        }
        boolean z3 = z2;
        Context context2 = context;
        PrimaryButton primaryButton2 = primaryButton;
        boolean z4 = z;
        return cryptoFeeTierStatusViewState.copy(str, str2, stringResource, f, primaryButton2, z4, z3, context2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrentTierFee() {
        return this.currentTierFee;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNextTierFee() {
        return this.nextTierFee;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getCurrentProgressText() {
        return this.currentProgressText;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getFeeTierProgress() {
        return this.feeTierProgress;
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

    public final CryptoFeeTierStatusViewState copy(String currentTierFee, String nextTierFee, StringResource currentProgressText, Float feeTierProgress, PrimaryButton primaryButton, boolean isContentLoading, boolean showError, Context eventContext) {
        return new CryptoFeeTierStatusViewState(currentTierFee, nextTierFee, currentProgressText, feeTierProgress, primaryButton, isContentLoading, showError, eventContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoFeeTierStatusViewState)) {
            return false;
        }
        CryptoFeeTierStatusViewState cryptoFeeTierStatusViewState = (CryptoFeeTierStatusViewState) other;
        return Intrinsics.areEqual(this.currentTierFee, cryptoFeeTierStatusViewState.currentTierFee) && Intrinsics.areEqual(this.nextTierFee, cryptoFeeTierStatusViewState.nextTierFee) && Intrinsics.areEqual(this.currentProgressText, cryptoFeeTierStatusViewState.currentProgressText) && Intrinsics.areEqual((Object) this.feeTierProgress, (Object) cryptoFeeTierStatusViewState.feeTierProgress) && this.primaryButton == cryptoFeeTierStatusViewState.primaryButton && this.isContentLoading == cryptoFeeTierStatusViewState.isContentLoading && this.showError == cryptoFeeTierStatusViewState.showError && Intrinsics.areEqual(this.eventContext, cryptoFeeTierStatusViewState.eventContext);
    }

    public int hashCode() {
        String str = this.currentTierFee;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nextTierFee;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        StringResource stringResource = this.currentProgressText;
        int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        Float f = this.feeTierProgress;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        PrimaryButton primaryButton = this.primaryButton;
        int iHashCode5 = (((((iHashCode4 + (primaryButton == null ? 0 : primaryButton.hashCode())) * 31) + Boolean.hashCode(this.isContentLoading)) * 31) + Boolean.hashCode(this.showError)) * 31;
        Context context = this.eventContext;
        return iHashCode5 + (context != null ? context.hashCode() : 0);
    }

    public String toString() {
        return "CryptoFeeTierStatusViewState(currentTierFee=" + this.currentTierFee + ", nextTierFee=" + this.nextTierFee + ", currentProgressText=" + this.currentProgressText + ", feeTierProgress=" + this.feeTierProgress + ", primaryButton=" + this.primaryButton + ", isContentLoading=" + this.isContentLoading + ", showError=" + this.showError + ", eventContext=" + this.eventContext + ")";
    }

    public CryptoFeeTierStatusViewState(String str, String str2, StringResource stringResource, Float f, PrimaryButton primaryButton, boolean z, boolean z2, Context context) {
        this.currentTierFee = str;
        this.nextTierFee = str2;
        this.currentProgressText = stringResource;
        this.feeTierProgress = f;
        this.primaryButton = primaryButton;
        this.isContentLoading = z;
        this.showError = z2;
        this.eventContext = context;
    }

    public final String getCurrentTierFee() {
        return this.currentTierFee;
    }

    public final String getNextTierFee() {
        return this.nextTierFee;
    }

    public final StringResource getCurrentProgressText() {
        return this.currentProgressText;
    }

    public final Float getFeeTierProgress() {
        return this.feeTierProgress;
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
    /* compiled from: CryptoFeeTierStatusViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierStatus/CryptoFeeTierStatusViewState$PrimaryButton;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "identifier", "", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getIdentifier", "()Ljava/lang/String;", "DONE", "CONTINUE", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            DONE = new PrimaryButton("DONE", 0, companion.invoke(C40095R.string.crypto_order_confirmation_your_fee_tier_status_cta_done, new Object[0]), "done");
            CONTINUE = new PrimaryButton("CONTINUE", 1, companion.invoke(C40095R.string.crypto_order_confirmation_your_fee_tier_status_cta_continue, new Object[0]), "continue");
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
