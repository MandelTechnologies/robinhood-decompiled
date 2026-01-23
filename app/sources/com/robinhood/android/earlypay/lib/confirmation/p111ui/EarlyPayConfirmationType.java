package com.robinhood.android.earlypay.lib.confirmation.p111ui;

import com.robinhood.android.earlypay.lib.C14449R;
import com.robinhood.android.libdesignsystem.C20690R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EarlyPayConfirmationType.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationType;", "", "illustration", "Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationType$Illustration;", "constraintWidthPercentOverride", "", "title", "", "description", "<init>", "(Ljava/lang/String;ILcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationType$Illustration;Ljava/lang/Float;II)V", "getIllustration", "()Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationType$Illustration;", "getConstraintWidthPercentOverride", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getTitle", "()I", "getDescription", "STANDARD", "SWITCHER", "MANUAL_DIRECT_DEPOSIT_SET_UP", "Illustration", "feature-lib-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EarlyPayConfirmationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EarlyPayConfirmationType[] $VALUES;
    public static final EarlyPayConfirmationType MANUAL_DIRECT_DEPOSIT_SET_UP;
    public static final EarlyPayConfirmationType STANDARD;
    public static final EarlyPayConfirmationType SWITCHER;
    private final Float constraintWidthPercentOverride;
    private final int description;
    private final Illustration illustration;
    private final int title;

    private static final /* synthetic */ EarlyPayConfirmationType[] $values() {
        return new EarlyPayConfirmationType[]{STANDARD, SWITCHER, MANUAL_DIRECT_DEPOSIT_SET_UP};
    }

    public static EnumEntries<EarlyPayConfirmationType> getEntries() {
        return $ENTRIES;
    }

    private EarlyPayConfirmationType(String str, int i, Illustration illustration, Float f, int i2, int i3) {
        this.illustration = illustration;
        this.constraintWidthPercentOverride = f;
        this.title = i2;
        this.description = i3;
    }

    /* synthetic */ EarlyPayConfirmationType(String str, int i, Illustration illustration, Float f, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, illustration, (i4 & 2) != 0 ? null : f, i2, i3);
    }

    public final Illustration getIllustration() {
        return this.illustration;
    }

    public final Float getConstraintWidthPercentOverride() {
        return this.constraintWidthPercentOverride;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getDescription() {
        return this.description;
    }

    static {
        Illustration.DrawableResource drawableResource = new Illustration.DrawableResource(C20690R.drawable.svg_emphasized_checkmark_green);
        int i = C14449R.string.early_pay_confirmation_alternate_title;
        int i2 = C14449R.string.early_pay_confirmation_alternate_description;
        Float fValueOf = Float.valueOf(0.6f);
        STANDARD = new EarlyPayConfirmationType("STANDARD", 0, drawableResource, fValueOf, i, i2);
        SWITCHER = new EarlyPayConfirmationType("SWITCHER", 1, new Illustration.DrawableResource(C20690R.drawable.svg_emphasized_checkmark_green), fValueOf, C14449R.string.switcher_early_pay_confirmation_title, C14449R.string.switcher_early_pay_confirmation_description);
        MANUAL_DIRECT_DEPOSIT_SET_UP = new EarlyPayConfirmationType("MANUAL_DIRECT_DEPOSIT_SET_UP", 2, new Illustration.DrawableResource(C20690R.drawable.svg_emphasized_checkmark_green), fValueOf, C14449R.string.early_pay_confirmation_alternate_title_2, C14449R.string.early_pay_manual_dd_setup_confirmation_description);
        EarlyPayConfirmationType[] earlyPayConfirmationTypeArr$values = $values();
        $VALUES = earlyPayConfirmationTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(earlyPayConfirmationTypeArr$values);
    }

    /* compiled from: EarlyPayConfirmationType.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationType$Illustration;", "", "resId", "", "<init>", "(I)V", "getResId", "()I", "LottieResource", "DrawableResource", "Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationType$Illustration$DrawableResource;", "Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationType$Illustration$LottieResource;", "feature-lib-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Illustration {
        private final int resId;

        public /* synthetic */ Illustration(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        private Illustration(int i) {
            this.resId = i;
        }

        public final int getResId() {
            return this.resId;
        }

        /* compiled from: EarlyPayConfirmationType.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationType$Illustration$LottieResource;", "Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationType$Illustration;", "resId", "", "<init>", "(I)V", "feature-lib-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class LottieResource extends Illustration {
            public LottieResource(int i) {
                super(i, null);
            }
        }

        /* compiled from: EarlyPayConfirmationType.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationType$Illustration$DrawableResource;", "Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationType$Illustration;", "resId", "", "<init>", "(I)V", "feature-lib-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DrawableResource extends Illustration {
            public DrawableResource(int i) {
                super(i, null);
            }
        }
    }

    public static EarlyPayConfirmationType valueOf(String str) {
        return (EarlyPayConfirmationType) Enum.valueOf(EarlyPayConfirmationType.class, str);
    }

    public static EarlyPayConfirmationType[] values() {
        return (EarlyPayConfirmationType[]) $VALUES.clone();
    }
}
