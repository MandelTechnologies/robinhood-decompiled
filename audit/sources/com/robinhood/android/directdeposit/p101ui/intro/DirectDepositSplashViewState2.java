package com.robinhood.android.directdeposit.p101ui.intro;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.extensions.LearnMoresKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectDepositSplashViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u001d\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/Bullet;", "", "titleResId", "", "detailResId", "<init>", "(II)V", "getTitleResId", "()I", "getDetailResId", "Earn", "PartialPaycheck", "Security", "EarlyPay", "SplitYourPaycheck", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet$EarlyPay;", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet$Earn;", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet$PartialPaycheck;", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet$Security;", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet$SplitYourPaycheck;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.intro.Bullet, reason: use source file name */
/* loaded from: classes27.dex */
public abstract class DirectDepositSplashViewState2 {
    public static final int $stable = 0;
    private final int detailResId;
    private final int titleResId;

    public /* synthetic */ DirectDepositSplashViewState2(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    private DirectDepositSplashViewState2(int i, int i2) {
        this.titleResId = i;
        this.detailResId = i2;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    protected final int getDetailResId() {
        return this.detailResId;
    }

    /* compiled from: DirectDepositSplashViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/Bullet$Earn;", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet;", "interestRate", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getDetailText", "", "resources", "Landroid/content/res/Resources;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.intro.Bullet$Earn, reason: from toString */
    public static final /* data */ class Earn extends DirectDepositSplashViewState2 {
        public static final int $stable = 8;
        private final BigDecimal interestRate;

        /* renamed from: component1, reason: from getter */
        private final BigDecimal getInterestRate() {
            return this.interestRate;
        }

        public static /* synthetic */ Earn copy$default(Earn earn, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = earn.interestRate;
            }
            return earn.copy(bigDecimal);
        }

        public final Earn copy(BigDecimal interestRate) {
            Intrinsics.checkNotNullParameter(interestRate, "interestRate");
            return new Earn(interestRate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Earn) && Intrinsics.areEqual(this.interestRate, ((Earn) other).interestRate);
        }

        public int hashCode() {
            return this.interestRate.hashCode();
        }

        public String toString() {
            return "Earn(interestRate=" + this.interestRate + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Earn(BigDecimal interestRate) {
            super(C14044R.string.direct_deposit_splash_earn_title, C14044R.string.direct_deposit_splash_earn_detail, null);
            Intrinsics.checkNotNullParameter(interestRate, "interestRate");
            this.interestRate = interestRate;
        }

        public final String getDetailText(Resources resources) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            String string2 = resources.getString(getDetailResId(), Formats.getInterestRateFormatShort().format(this.interestRate));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
    }

    /* compiled from: DirectDepositSplashViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/Bullet$PartialPaycheck;", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet;", "showDisclosure", "", "<init>", "(Z)V", "getDetailText", "", "resources", "Landroid/content/res/Resources;", "onDisclosureClick", "Lkotlin/Function1;", "", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.directdeposit.ui.intro.Bullet$PartialPaycheck */
    public static final class PartialPaycheck extends DirectDepositSplashViewState2 {
        public static final int $stable = 0;
        private final boolean showDisclosure;

        public PartialPaycheck() {
            this(false, 1, null);
        }

        public /* synthetic */ PartialPaycheck(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public PartialPaycheck(boolean z) {
            super(C14044R.string.direct_deposit_splash_partial_title, C14044R.string.direct_deposit_splash_partial_detail, null);
            this.showDisclosure = z;
        }

        public final CharSequence getDetailText(Resources resources, final Function1<? super String, Unit> onDisclosureClick) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(onDisclosureClick, "onDisclosureClick");
            if (this.showDisclosure) {
                String string2 = resources.getString(getDetailResId());
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return LearnMoresKt.buildTextWithLearnMore$default(resources, string2, true, null, true, resources.getString(C14044R.string.direct_deposit_splash_partial_disclosure_label), new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.directdeposit.ui.intro.Bullet$PartialPaycheck$getDetailText$$inlined$buildTextWithLearnMore$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        onDisclosureClick.invoke("2qQYDXMUh8rdtLSJWw0nRb");
                    }
                }, 1, (DefaultConstructorMarker) null), 4, null);
            }
            return resources.getString(getDetailResId()) + "*";
        }
    }

    /* compiled from: DirectDepositSplashViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/Bullet$Security;", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet;", "<init>", "()V", "getDetailText", "", "resources", "Landroid/content/res/Resources;", "onLearnMoreClick", "Lkotlin/Function1;", "", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.directdeposit.ui.intro.Bullet$Security */
    public static final class Security extends DirectDepositSplashViewState2 {
        public static final int $stable = 0;
        public static final Security INSTANCE = new Security();

        private Security() {
            super(C14044R.string.direct_deposit_splash_security_title, C14044R.string.direct_deposit_splash_security_detail, null);
        }

        public final CharSequence getDetailText(final Resources resources, final Function1<? super String, Unit> onLearnMoreClick) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(onLearnMoreClick, "onLearnMoreClick");
            CharSequence text = resources.getText(getDetailResId());
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            return LearnMoresKt.buildTextWithLearnMore$default(resources, text, true, null, true, null, new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.directdeposit.ui.intro.Bullet$Security$getDetailText$$inlined$buildTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws Resources.NotFoundException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws Resources.NotFoundException {
                    Function1 function1 = onLearnMoreClick;
                    String string2 = resources.getString(C11048R.string.url_account_security_faq);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    function1.invoke(string2);
                }
            }, 1, (DefaultConstructorMarker) null), 4, null);
        }
    }

    /* compiled from: DirectDepositSplashViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/Bullet$EarlyPay;", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet;", "<init>", "()V", "getDetailText", "", "resources", "Landroid/content/res/Resources;", "onLearnMoreClick", "Lkotlin/Function0;", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.directdeposit.ui.intro.Bullet$EarlyPay */
    public static final class EarlyPay extends DirectDepositSplashViewState2 {
        public static final int $stable = 0;
        public static final EarlyPay INSTANCE = new EarlyPay();

        private EarlyPay() {
            super(C14044R.string.direct_deposit_splash_early_pay_title, C14044R.string.direct_deposit_splash_early_pay_detail, null);
        }

        public final CharSequence getDetailText(Resources resources, final Function0<Unit> onLearnMoreClick) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(onLearnMoreClick, "onLearnMoreClick");
            CharSequence text = resources.getText(getDetailResId());
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            return LearnMoresKt.buildTextWithLearnMore$default(resources, text, true, null, true, null, new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.directdeposit.ui.intro.Bullet$EarlyPay$getDetailText$$inlined$buildTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    onLearnMoreClick.invoke();
                }
            }, 1, (DefaultConstructorMarker) null), 4, null);
        }
    }

    /* compiled from: DirectDepositSplashViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/Bullet$SplitYourPaycheck;", "Lcom/robinhood/android/directdeposit/ui/intro/Bullet;", "sweepsInterest", "Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "<init>", "(Lcom/robinhood/models/db/mcduckling/SweepsInterest;)V", "getDetailText", "", "resources", "Landroid/content/res/Resources;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.intro.Bullet$SplitYourPaycheck */
    public static final class SplitYourPaycheck extends DirectDepositSplashViewState2 {
        public static final int $stable = 8;
        private final SweepsInterest sweepsInterest;

        /* JADX WARN: Multi-variable type inference failed */
        public SplitYourPaycheck() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ SplitYourPaycheck(SweepsInterest sweepsInterest, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : sweepsInterest);
        }

        public SplitYourPaycheck(SweepsInterest sweepsInterest) {
            super(C14044R.string.direct_deposit_splash_syp_title, C14044R.string.direct_deposit_splash_syp_detail_no_brokerage_cash, null);
            this.sweepsInterest = sweepsInterest;
        }

        public final String getDetailText(Resources resources) throws Resources.NotFoundException {
            BigDecimal interestRate;
            Intrinsics.checkNotNullParameter(resources, "resources");
            SweepsInterest sweepsInterest = this.sweepsInterest;
            if (sweepsInterest == null || (interestRate = sweepsInterest.getGoldInterestRate()) == null) {
                SweepsInterest sweepsInterest2 = this.sweepsInterest;
                interestRate = sweepsInterest2 != null ? sweepsInterest2.getInterestRate() : null;
            }
            if (interestRate != null) {
                String string2 = resources.getString(C14044R.string.direct_deposit_splash_syp_detail_brokerage_cash, Formats.getInterestRateFormatShort().format(interestRate));
                Intrinsics.checkNotNull(string2);
                return string2;
            }
            String string3 = resources.getString(getDetailResId());
            Intrinsics.checkNotNull(string3);
            return string3;
        }
    }
}
