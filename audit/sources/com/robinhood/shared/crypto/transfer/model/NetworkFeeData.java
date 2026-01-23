package com.robinhood.shared.crypto.transfer.model;

import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
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
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NetworkFeeData.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\t\nJ\r\u0010\u0002\u001a\u00020\u0003H'¢\u0006\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;", "", "buildDisplayFee", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "netFee", "", "getNetFee", "()Ljava/lang/String;", "GoldRefund", "Default", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData$Default;", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData$GoldRefund;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface NetworkFeeData {
    AnnotatedString buildDisplayFee(Composer composer, int i);

    String getNetFee();

    /* compiled from: NetworkFeeData.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData$GoldRefund;", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;", "netFee", "", "getNetFee", "()Ljava/lang/String;", "baseFee", "getBaseFee", "separator", "getSeparator", "Review", "Receipt", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData$GoldRefund$Receipt;", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData$GoldRefund$Review;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface GoldRefund extends NetworkFeeData {
        String getBaseFee();

        @Override // com.robinhood.shared.crypto.transfer.model.NetworkFeeData
        String getNetFee();

        String getSeparator();

        /* compiled from: NetworkFeeData.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\f\u001a\u00020\rH\u0017¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData$GoldRefund$Review;", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData$GoldRefund;", "netFee", "", "baseFee", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNetFee", "()Ljava/lang/String;", "getBaseFee", "separator", "getSeparator", "buildDisplayFee", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class Review implements GoldRefund {
            public static final int $stable = 0;
            private final String baseFee;
            private final String netFee;

            public static /* synthetic */ Review copy$default(Review review, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = review.netFee;
                }
                if ((i & 2) != 0) {
                    str2 = review.baseFee;
                }
                return review.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getNetFee() {
                return this.netFee;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBaseFee() {
                return this.baseFee;
            }

            public final Review copy(String netFee, String baseFee) {
                Intrinsics.checkNotNullParameter(netFee, "netFee");
                Intrinsics.checkNotNullParameter(baseFee, "baseFee");
                return new Review(netFee, baseFee);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Review)) {
                    return false;
                }
                Review review = (Review) other;
                return Intrinsics.areEqual(this.netFee, review.netFee) && Intrinsics.areEqual(this.baseFee, review.baseFee);
            }

            public int hashCode() {
                return (this.netFee.hashCode() * 31) + this.baseFee.hashCode();
            }

            public String toString() {
                return "Review(netFee=" + this.netFee + ", baseFee=" + this.baseFee + ")";
            }

            public Review(String netFee, String baseFee) {
                Intrinsics.checkNotNullParameter(netFee, "netFee");
                Intrinsics.checkNotNullParameter(baseFee, "baseFee");
                this.netFee = netFee;
                this.baseFee = baseFee;
            }

            @Override // com.robinhood.shared.crypto.transfer.model.NetworkFeeData.GoldRefund, com.robinhood.shared.crypto.transfer.model.NetworkFeeData
            public String getNetFee() {
                return this.netFee;
            }

            @Override // com.robinhood.shared.crypto.transfer.model.NetworkFeeData.GoldRefund
            public String getBaseFee() {
                return this.baseFee;
            }

            @Override // com.robinhood.shared.crypto.transfer.model.NetworkFeeData.GoldRefund
            public String getSeparator() {
                return PlaceholderUtils.XXShortPlaceholderText;
            }

            @Override // com.robinhood.shared.crypto.transfer.model.NetworkFeeData
            public AnnotatedString buildDisplayFee(Composer composer, int i) {
                composer.startReplaceGroup(1319221318);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1319221318, i, -1, "com.robinhood.shared.crypto.transfer.model.NetworkFeeData.GoldRefund.Review.buildDisplayFee (NetworkFeeData.kt:32)");
                }
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61439, (DefaultConstructorMarker) null));
                try {
                    builder.append(getBaseFee());
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    builder.append(getSeparator());
                    builder.append(getNetFee());
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return annotatedString;
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            }
        }

        /* compiled from: NetworkFeeData.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\f\u001a\u00020\rH\u0017¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData$GoldRefund$Receipt;", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData$GoldRefund;", "netFee", "", "baseFee", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNetFee", "()Ljava/lang/String;", "getBaseFee", "separator", "getSeparator", "buildDisplayFee", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class Receipt implements GoldRefund {
            public static final int $stable = 0;
            private final String baseFee;
            private final String netFee;

            public static /* synthetic */ Receipt copy$default(Receipt receipt, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = receipt.netFee;
                }
                if ((i & 2) != 0) {
                    str2 = receipt.baseFee;
                }
                return receipt.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getNetFee() {
                return this.netFee;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBaseFee() {
                return this.baseFee;
            }

            public final Receipt copy(String netFee, String baseFee) {
                Intrinsics.checkNotNullParameter(netFee, "netFee");
                Intrinsics.checkNotNullParameter(baseFee, "baseFee");
                return new Receipt(netFee, baseFee);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Receipt)) {
                    return false;
                }
                Receipt receipt = (Receipt) other;
                return Intrinsics.areEqual(this.netFee, receipt.netFee) && Intrinsics.areEqual(this.baseFee, receipt.baseFee);
            }

            public int hashCode() {
                return (this.netFee.hashCode() * 31) + this.baseFee.hashCode();
            }

            public String toString() {
                return "Receipt(netFee=" + this.netFee + ", baseFee=" + this.baseFee + ")";
            }

            public Receipt(String netFee, String baseFee) {
                Intrinsics.checkNotNullParameter(netFee, "netFee");
                Intrinsics.checkNotNullParameter(baseFee, "baseFee");
                this.netFee = netFee;
                this.baseFee = baseFee;
            }

            @Override // com.robinhood.shared.crypto.transfer.model.NetworkFeeData.GoldRefund, com.robinhood.shared.crypto.transfer.model.NetworkFeeData
            public String getNetFee() {
                return this.netFee;
            }

            @Override // com.robinhood.shared.crypto.transfer.model.NetworkFeeData.GoldRefund
            public String getBaseFee() {
                return this.baseFee;
            }

            @Override // com.robinhood.shared.crypto.transfer.model.NetworkFeeData.GoldRefund
            public String getSeparator() {
                return "\n";
            }

            @Override // com.robinhood.shared.crypto.transfer.model.NetworkFeeData
            public AnnotatedString buildDisplayFee(Composer composer, int i) {
                composer.startReplaceGroup(-1081335194);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1081335194, i, -1, "com.robinhood.shared.crypto.transfer.model.NetworkFeeData.GoldRefund.Receipt.buildDisplayFee (NetworkFeeData.kt:50)");
                }
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(getNetFee());
                builder.append(getSeparator());
                TextDecoration lineThrough = TextDecoration.INSTANCE.getLineThrough();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getTypography(composer, i2).getTextS().m7662getFontSizeXSAIIZE(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, lineThrough, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61436, (DefaultConstructorMarker) null));
                try {
                    builder.append(getBaseFee());
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return annotatedString;
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            }
        }
    }

    /* compiled from: NetworkFeeData.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0017¢\u0006\u0002\u0010\nJ\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData$Default;", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;", "netFee", "", "<init>", "(Ljava/lang/String;)V", "getNetFee", "()Ljava/lang/String;", "buildDisplayFee", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Default implements NetworkFeeData {
        public static final int $stable = 0;
        private final String netFee;

        public static /* synthetic */ Default copy$default(Default r0, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.netFee;
            }
            return r0.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNetFee() {
            return this.netFee;
        }

        public final Default copy(String netFee) {
            Intrinsics.checkNotNullParameter(netFee, "netFee");
            return new Default(netFee);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Default) && Intrinsics.areEqual(this.netFee, ((Default) other).netFee);
        }

        public int hashCode() {
            return this.netFee.hashCode();
        }

        public String toString() {
            return "Default(netFee=" + this.netFee + ")";
        }

        public Default(String netFee) {
            Intrinsics.checkNotNullParameter(netFee, "netFee");
            this.netFee = netFee;
        }

        @Override // com.robinhood.shared.crypto.transfer.model.NetworkFeeData
        public String getNetFee() {
            return this.netFee;
        }

        @Override // com.robinhood.shared.crypto.transfer.model.NetworkFeeData
        public AnnotatedString buildDisplayFee(Composer composer, int i) {
            composer.startReplaceGroup(-1270360759);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1270360759, i, -1, "com.robinhood.shared.crypto.transfer.model.NetworkFeeData.Default.buildDisplayFee (NetworkFeeData.kt:71)");
            }
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(getNetFee());
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return annotatedString;
        }
    }
}
