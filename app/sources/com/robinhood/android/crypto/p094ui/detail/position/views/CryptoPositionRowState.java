package com.robinhood.android.crypto.p094ui.detail.position.views;

import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CryptoPositionRow.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*+BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003JS\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState;", "", "isCondensed", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "showDottedLabelUnderline", "text", "Landroidx/compose/ui/text/AnnotatedString;", "textTrailingContent", "Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TextTrailingContent;", "tooltipType", "Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TooltipType;", "analyticsIdentifier", "", "<init>", "(ZLcom/robinhood/utils/resource/StringResource;ZLandroidx/compose/ui/text/AnnotatedString;Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TextTrailingContent;Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TooltipType;Ljava/lang/String;)V", "()Z", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getShowDottedLabelUnderline", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "getTextTrailingContent", "()Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TextTrailingContent;", "getTooltipType", "()Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TooltipType;", "getAnalyticsIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "TextTrailingContent", "TooltipType", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoPositionRowState {
    public static final int $stable = StringResource.$stable;
    private final String analyticsIdentifier;
    private final boolean isCondensed;
    private final StringResource label;
    private final boolean showDottedLabelUnderline;
    private final AnnotatedString text;
    private final TextTrailingContent textTrailingContent;
    private final TooltipType tooltipType;

    public static /* synthetic */ CryptoPositionRowState copy$default(CryptoPositionRowState cryptoPositionRowState, boolean z, StringResource stringResource, boolean z2, AnnotatedString annotatedString, TextTrailingContent textTrailingContent, TooltipType tooltipType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoPositionRowState.isCondensed;
        }
        if ((i & 2) != 0) {
            stringResource = cryptoPositionRowState.label;
        }
        if ((i & 4) != 0) {
            z2 = cryptoPositionRowState.showDottedLabelUnderline;
        }
        if ((i & 8) != 0) {
            annotatedString = cryptoPositionRowState.text;
        }
        if ((i & 16) != 0) {
            textTrailingContent = cryptoPositionRowState.textTrailingContent;
        }
        if ((i & 32) != 0) {
            tooltipType = cryptoPositionRowState.tooltipType;
        }
        if ((i & 64) != 0) {
            str = cryptoPositionRowState.analyticsIdentifier;
        }
        TooltipType tooltipType2 = tooltipType;
        String str2 = str;
        TextTrailingContent textTrailingContent2 = textTrailingContent;
        boolean z3 = z2;
        return cryptoPositionRowState.copy(z, stringResource, z3, annotatedString, textTrailingContent2, tooltipType2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCondensed() {
        return this.isCondensed;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowDottedLabelUnderline() {
        return this.showDottedLabelUnderline;
    }

    /* renamed from: component4, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final TextTrailingContent getTextTrailingContent() {
        return this.textTrailingContent;
    }

    /* renamed from: component6, reason: from getter */
    public final TooltipType getTooltipType() {
        return this.tooltipType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAnalyticsIdentifier() {
        return this.analyticsIdentifier;
    }

    public final CryptoPositionRowState copy(boolean isCondensed, StringResource label, boolean showDottedLabelUnderline, AnnotatedString text, TextTrailingContent textTrailingContent, TooltipType tooltipType, String analyticsIdentifier) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(analyticsIdentifier, "analyticsIdentifier");
        return new CryptoPositionRowState(isCondensed, label, showDottedLabelUnderline, text, textTrailingContent, tooltipType, analyticsIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoPositionRowState)) {
            return false;
        }
        CryptoPositionRowState cryptoPositionRowState = (CryptoPositionRowState) other;
        return this.isCondensed == cryptoPositionRowState.isCondensed && Intrinsics.areEqual(this.label, cryptoPositionRowState.label) && this.showDottedLabelUnderline == cryptoPositionRowState.showDottedLabelUnderline && Intrinsics.areEqual(this.text, cryptoPositionRowState.text) && Intrinsics.areEqual(this.textTrailingContent, cryptoPositionRowState.textTrailingContent) && Intrinsics.areEqual(this.tooltipType, cryptoPositionRowState.tooltipType) && Intrinsics.areEqual(this.analyticsIdentifier, cryptoPositionRowState.analyticsIdentifier);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isCondensed) * 31) + this.label.hashCode()) * 31) + Boolean.hashCode(this.showDottedLabelUnderline)) * 31) + this.text.hashCode()) * 31;
        TextTrailingContent textTrailingContent = this.textTrailingContent;
        int iHashCode2 = (iHashCode + (textTrailingContent == null ? 0 : textTrailingContent.hashCode())) * 31;
        TooltipType tooltipType = this.tooltipType;
        return ((iHashCode2 + (tooltipType != null ? tooltipType.hashCode() : 0)) * 31) + this.analyticsIdentifier.hashCode();
    }

    public String toString() {
        boolean z = this.isCondensed;
        StringResource stringResource = this.label;
        boolean z2 = this.showDottedLabelUnderline;
        AnnotatedString annotatedString = this.text;
        return "CryptoPositionRowState(isCondensed=" + z + ", label=" + stringResource + ", showDottedLabelUnderline=" + z2 + ", text=" + ((Object) annotatedString) + ", textTrailingContent=" + this.textTrailingContent + ", tooltipType=" + this.tooltipType + ", analyticsIdentifier=" + this.analyticsIdentifier + ")";
    }

    public CryptoPositionRowState(boolean z, StringResource label, boolean z2, AnnotatedString text, TextTrailingContent textTrailingContent, TooltipType tooltipType, String analyticsIdentifier) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(analyticsIdentifier, "analyticsIdentifier");
        this.isCondensed = z;
        this.label = label;
        this.showDottedLabelUnderline = z2;
        this.text = text;
        this.textTrailingContent = textTrailingContent;
        this.tooltipType = tooltipType;
        this.analyticsIdentifier = analyticsIdentifier;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CryptoPositionRowState(boolean z, StringResource stringResource, boolean z2, AnnotatedString annotatedString, TextTrailingContent textTrailingContent, TooltipType tooltipType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str2;
        TooltipType tooltipType2;
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        textTrailingContent = (i & 16) != 0 ? null : textTrailingContent;
        if ((i & 32) != 0) {
            str2 = str;
            tooltipType2 = null;
        } else {
            str2 = str;
            tooltipType2 = tooltipType;
        }
        this(z, stringResource, z2, annotatedString, textTrailingContent, tooltipType2, str2);
    }

    public final boolean isCondensed() {
        return this.isCondensed;
    }

    public final StringResource getLabel() {
        return this.label;
    }

    public final boolean getShowDottedLabelUnderline() {
        return this.showDottedLabelUnderline;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public final TextTrailingContent getTextTrailingContent() {
        return this.textTrailingContent;
    }

    public final TooltipType getTooltipType() {
        return this.tooltipType;
    }

    public final String getAnalyticsIdentifier() {
        return this.analyticsIdentifier;
    }

    /* compiled from: CryptoPositionRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TextTrailingContent;", "", "<init>", "()V", "PieChart", "Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TextTrailingContent$PieChart;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class TextTrailingContent {
        public static final int $stable = 0;

        public /* synthetic */ TextTrailingContent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: CryptoPositionRow.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TextTrailingContent$PieChart;", "Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TextTrailingContent;", "percentage", "", "<init>", "(F)V", "getPercentage", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PieChart extends TextTrailingContent {
            public static final int $stable = 0;
            private final float percentage;

            public static /* synthetic */ PieChart copy$default(PieChart pieChart, float f, int i, Object obj) {
                if ((i & 1) != 0) {
                    f = pieChart.percentage;
                }
                return pieChart.copy(f);
            }

            /* renamed from: component1, reason: from getter */
            public final float getPercentage() {
                return this.percentage;
            }

            public final PieChart copy(float percentage) {
                return new PieChart(percentage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PieChart) && Float.compare(this.percentage, ((PieChart) other).percentage) == 0;
            }

            public int hashCode() {
                return Float.hashCode(this.percentage);
            }

            public String toString() {
                return "PieChart(percentage=" + this.percentage + ")";
            }

            public PieChart(float f) {
                super(null);
                this.percentage = f;
            }

            public final float getPercentage() {
                return this.percentage;
            }
        }

        private TextTrailingContent() {
        }
    }

    /* compiled from: CryptoPositionRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TooltipType;", "", "<init>", "()V", "OptimizedCostReturnCalculations", "Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TooltipType$OptimizedCostReturnCalculations;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class TooltipType {
        public static final int $stable = 0;

        public /* synthetic */ TooltipType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: CryptoPositionRow.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TooltipType$OptimizedCostReturnCalculations;", "Lcom/robinhood/android/crypto/ui/detail/position/views/CryptoPositionRowState$TooltipType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OptimizedCostReturnCalculations extends TooltipType {
            public static final int $stable = 0;
            public static final OptimizedCostReturnCalculations INSTANCE = new OptimizedCostReturnCalculations();

            public boolean equals(Object other) {
                return this == other || (other instanceof OptimizedCostReturnCalculations);
            }

            public int hashCode() {
                return -325667783;
            }

            public String toString() {
                return "OptimizedCostReturnCalculations";
            }

            private OptimizedCostReturnCalculations() {
                super(null);
            }
        }

        private TooltipType() {
        }
    }
}
