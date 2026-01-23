package com.robinhood.android.engagement.depositincentive;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DepositIncentivePillComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0012\u0013BA\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0011\u0010\u000e\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/engagement/depositincentive/PillStyle;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Shape;", "shapeBuilder", "Landroidx/compose/ui/unit/Dp;", "horizontalPadding", "verticalPadding", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "getShapeBuilder", "()Lkotlin/jvm/functions/Function2;", "getHorizontalPadding", "getVerticalPadding", "getTextStyle", "InfoTagPill", "IncentivesPill", "Lcom/robinhood/android/engagement/depositincentive/PillStyle$IncentivesPill;", "Lcom/robinhood/android/engagement/depositincentive/PillStyle$InfoTagPill;", "lib-deposit-incentive_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.engagement.depositincentive.PillStyle, reason: use source file name */
/* loaded from: classes7.dex */
public abstract class DepositIncentivePillComposable4 {
    public static final int $stable = 0;
    private final Function2<Composer, Integer, C2002Dp> horizontalPadding;
    private final Function2<Composer, Integer, Shape> shapeBuilder;
    private final Function2<Composer, Integer, TextStyle> textStyle;
    private final Function2<Composer, Integer, C2002Dp> verticalPadding;

    public /* synthetic */ DepositIncentivePillComposable4(Function2 function2, Function2 function22, Function2 function23, Function2 function24, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, function22, function23, function24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DepositIncentivePillComposable4(Function2<? super Composer, ? super Integer, ? extends Shape> function2, Function2<? super Composer, ? super Integer, C2002Dp> function22, Function2<? super Composer, ? super Integer, C2002Dp> function23, Function2<? super Composer, ? super Integer, TextStyle> function24) {
        this.shapeBuilder = function2;
        this.horizontalPadding = function22;
        this.verticalPadding = function23;
        this.textStyle = function24;
    }

    public final Function2<Composer, Integer, Shape> getShapeBuilder() {
        return this.shapeBuilder;
    }

    public final Function2<Composer, Integer, C2002Dp> getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final Function2<Composer, Integer, C2002Dp> getVerticalPadding() {
        return this.verticalPadding;
    }

    public final Function2<Composer, Integer, TextStyle> getTextStyle() {
        return this.textStyle;
    }

    /* compiled from: DepositIncentivePillComposable.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/engagement/depositincentive/PillStyle$InfoTagPill;", "Lcom/robinhood/android/engagement/depositincentive/PillStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-deposit-incentive_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.engagement.depositincentive.PillStyle$InfoTagPill */
    public static final /* data */ class InfoTagPill extends DepositIncentivePillComposable4 {
        public static final int $stable = 0;
        public static final InfoTagPill INSTANCE = new InfoTagPill();

        public boolean equals(Object other) {
            return this == other || (other instanceof InfoTagPill);
        }

        public int hashCode() {
            return 1042010697;
        }

        public String toString() {
            return "InfoTagPill";
        }

        private InfoTagPill() {
            super(new Function2<Composer, Integer, Shape>() { // from class: com.robinhood.android.engagement.depositincentive.PillStyle.InfoTagPill.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Shape invoke(Composer composer, Integer num) {
                    return invoke(composer, num.intValue());
                }

                public final Shape invoke(Composer composer, int i) {
                    composer.startReplaceGroup(-858040760);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-858040760, i, -1, "com.robinhood.android.engagement.depositincentive.PillStyle.InfoTagPill.<init>.<anonymous> (DepositIncentivePillComposable.kt:110)");
                    }
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(100));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return roundedCornerShapeM5327RoundedCornerShape0680j_4;
                }
            }, new Function2<Composer, Integer, C2002Dp>() { // from class: com.robinhood.android.engagement.depositincentive.PillStyle.InfoTagPill.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ C2002Dp invoke(Composer composer, Integer num) {
                    return C2002Dp.m7993boximpl(m13494invokechRvn1I(composer, num.intValue()));
                }

                /* renamed from: invoke-chRvn1I, reason: not valid java name */
                public final float m13494invokechRvn1I(Composer composer, int i) {
                    composer.startReplaceGroup(-78316608);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-78316608, i, -1, "com.robinhood.android.engagement.depositincentive.PillStyle.InfoTagPill.<init>.<anonymous> (DepositIncentivePillComposable.kt:108)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM() - bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM());
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return fM7995constructorimpl;
                }
            }, new Function2<Composer, Integer, C2002Dp>() { // from class: com.robinhood.android.engagement.depositincentive.PillStyle.InfoTagPill.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ C2002Dp invoke(Composer composer, Integer num) {
                    return C2002Dp.m7993boximpl(m13495invokechRvn1I(composer, num.intValue()));
                }

                /* renamed from: invoke-chRvn1I, reason: not valid java name */
                public final float m13495invokechRvn1I(Composer composer, int i) {
                    composer.startReplaceGroup(-2020495073);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2020495073, i, -1, "com.robinhood.android.engagement.depositincentive.PillStyle.InfoTagPill.<init>.<anonymous> (DepositIncentivePillComposable.kt:109)");
                    }
                    float fM21595getXsmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21595getXsmallD9Ej5fM();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return fM21595getXsmallD9Ej5fM;
                }
            }, new Function2<Composer, Integer, TextStyle>() { // from class: com.robinhood.android.engagement.depositincentive.PillStyle.InfoTagPill.4
                public final TextStyle invoke(Composer composer, int i) {
                    composer.startReplaceGroup(-1042488094);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1042488094, i, -1, "com.robinhood.android.engagement.depositincentive.PillStyle.InfoTagPill.<init>.<anonymous> (DepositIncentivePillComposable.kt:111)");
                    }
                    TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return textStyleM7655copyp1EtxEg$default;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                    return invoke(composer, num.intValue());
                }
            }, null);
        }
    }

    /* compiled from: DepositIncentivePillComposable.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/engagement/depositincentive/PillStyle$IncentivesPill;", "Lcom/robinhood/android/engagement/depositincentive/PillStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-deposit-incentive_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.engagement.depositincentive.PillStyle$IncentivesPill */
    public static final /* data */ class IncentivesPill extends DepositIncentivePillComposable4 {
        public static final int $stable = 0;
        public static final IncentivesPill INSTANCE = new IncentivesPill();

        public boolean equals(Object other) {
            return this == other || (other instanceof IncentivesPill);
        }

        public int hashCode() {
            return 865415261;
        }

        public String toString() {
            return "IncentivesPill";
        }

        private IncentivesPill() {
            super(new Function2<Composer, Integer, Shape>() { // from class: com.robinhood.android.engagement.depositincentive.PillStyle.IncentivesPill.1
                public final Shape invoke(Composer composer, int i) {
                    composer.startReplaceGroup(-922847586);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-922847586, i, -1, "com.robinhood.android.engagement.depositincentive.PillStyle.IncentivesPill.<init>.<anonymous> (DepositIncentivePillComposable.kt:117)");
                    }
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM());
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return roundedCornerShapeM5327RoundedCornerShape0680j_4;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Shape invoke(Composer composer, Integer num) {
                    return invoke(composer, num.intValue());
                }
            }, new Function2<Composer, Integer, C2002Dp>() { // from class: com.robinhood.android.engagement.depositincentive.PillStyle.IncentivesPill.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ C2002Dp invoke(Composer composer, Integer num) {
                    return C2002Dp.m7993boximpl(m13492invokechRvn1I(composer, num.intValue()));
                }

                /* renamed from: invoke-chRvn1I, reason: not valid java name */
                public final float m13492invokechRvn1I(Composer composer, int i) {
                    composer.startReplaceGroup(656227878);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(656227878, i, -1, "com.robinhood.android.engagement.depositincentive.PillStyle.IncentivesPill.<init>.<anonymous> (DepositIncentivePillComposable.kt:115)");
                    }
                    float fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return fM21590getDefaultD9Ej5fM;
                }
            }, new Function2<Composer, Integer, C2002Dp>() { // from class: com.robinhood.android.engagement.depositincentive.PillStyle.IncentivesPill.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ C2002Dp invoke(Composer composer, Integer num) {
                    return C2002Dp.m7993boximpl(m13493invokechRvn1I(composer, num.intValue()));
                }

                /* renamed from: invoke-chRvn1I, reason: not valid java name */
                public final float m13493invokechRvn1I(Composer composer, int i) {
                    composer.startReplaceGroup(-1277978521);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1277978521, i, -1, "com.robinhood.android.engagement.depositincentive.PillStyle.IncentivesPill.<init>.<anonymous> (DepositIncentivePillComposable.kt:116)");
                    }
                    float fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return fM21593getSmallD9Ej5fM;
                }
            }, new Function2<Composer, Integer, TextStyle>() { // from class: com.robinhood.android.engagement.depositincentive.PillStyle.IncentivesPill.4
                public final TextStyle invoke(Composer composer, int i) {
                    composer.startReplaceGroup(1764764100);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1764764100, i, -1, "com.robinhood.android.engagement.depositincentive.PillStyle.IncentivesPill.<init>.<anonymous> (DepositIncentivePillComposable.kt:118)");
                    }
                    TextStyle textM = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return textM;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ TextStyle invoke(Composer composer, Integer num) {
                    return invoke(composer, num.intValue());
                }
            }, null);
        }
    }
}
