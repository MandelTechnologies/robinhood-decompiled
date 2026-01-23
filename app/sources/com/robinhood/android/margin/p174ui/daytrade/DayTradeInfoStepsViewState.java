package com.robinhood.android.margin.p174ui.daytrade;

import com.robinhood.android.margin.model.UiDayTradeDisclosure;
import com.robinhood.android.margin.model.UiDayTradeInfo;
import com.robinhood.android.margin.model.UiDayTradeInfoStep;
import com.robinhood.android.margin.model.UiDayTradeInfoVariant;
import com.robinhood.udf.UiEvent;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DayTradeInfoStepsViewState.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001GBi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u00109\u001a\u00020\u0003HÂ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010;\u001a\u00020\u0007HÂ\u0003J\t\u0010<\u001a\u00020\u0007HÂ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010?\u001a\u00020\u000eHÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003Jk\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u0010B\u001a\u00020\u00072\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u000eHÖ\u0001J\t\u0010E\u001a\u00020FHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010 \u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\"\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010$\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010(\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0016R\u0011\u00100\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0016R\u0011\u00102\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0011\u00107\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u00104¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState;", "", "stage", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStage;", "dayTradeInfo", "Lcom/robinhood/android/margin/model/UiDayTradeInfo;", "canShowCashManagement", "", "cashManagementLimitedInterest", "pdtEnableChangeComplete", "Lcom/robinhood/udf/UiEvent;", "", "pdtEnableChangeError", "selectedStep", "", "selectedVariant", "<init>", "(Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStage;Lcom/robinhood/android/margin/model/UiDayTradeInfo;ZZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;II)V", "getPdtEnableChangeComplete", "()Lcom/robinhood/udf/UiEvent;", "getPdtEnableChangeError", "getSelectedStep", "()I", "getSelectedVariant", "steps", "", "Lcom/robinhood/android/margin/model/UiDayTradeInfoStep;", "getSteps", "()Ljava/util/List;", "variants", "Lcom/robinhood/android/margin/model/UiDayTradeInfoVariant;", "getVariants", "currentStepProgress", "getCurrentStepProgress", "maxStepProgress", "getMaxStepProgress", "continueButtonAction", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction;", "getContinueButtonAction", "()Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction;", "currentStep", "getCurrentStep", "()Lcom/robinhood/android/margin/model/UiDayTradeInfoStep;", "currentVariant", "getCurrentVariant", "()Lcom/robinhood/android/margin/model/UiDayTradeInfoVariant;", "progressCurrent", "getProgressCurrent", "progressMax", "getProgressMax", "showSkip", "getShowSkip", "()Z", "showDisclosureModal", "getShowDisclosureModal", "showProgressBar", "getShowProgressBar", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "ContinueButtonAction", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class DayTradeInfoStepsViewState {
    public static final int $stable = 8;
    private final boolean canShowCashManagement;
    private final boolean cashManagementLimitedInterest;
    private final UiDayTradeInfoStep currentStep;
    private final int currentStepProgress;
    private final UiDayTradeInfoVariant currentVariant;
    private final UiDayTradeInfo dayTradeInfo;
    private final int maxStepProgress;
    private final UiEvent<Unit> pdtEnableChangeComplete;
    private final UiEvent<Unit> pdtEnableChangeError;
    private final int progressCurrent;
    private final int progressMax;
    private final int selectedStep;
    private final int selectedVariant;
    private final boolean showDisclosureModal;
    private final boolean showProgressBar;
    private final boolean showSkip;
    private final DayTradeInfoStage stage;
    private final List<UiDayTradeInfoStep> steps;
    private final List<UiDayTradeInfoVariant> variants;

    /* compiled from: DayTradeInfoStepsViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayTradeInfoStage.values().length];
            try {
                iArr[DayTradeInfoStage.INTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayTradeInfoStage.TUTORIAL_STEPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DayTradeInfoStage.RECOMMEND_PROTECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DayTradeInfoStage.PROTECTION_ENABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DayTradeInfoStepsViewState() {
        this(null, null, false, false, null, null, 0, 0, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    private final DayTradeInfoStage getStage() {
        return this.stage;
    }

    /* renamed from: component2, reason: from getter */
    private final UiDayTradeInfo getDayTradeInfo() {
        return this.dayTradeInfo;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getCanShowCashManagement() {
        return this.canShowCashManagement;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getCashManagementLimitedInterest() {
        return this.cashManagementLimitedInterest;
    }

    public static /* synthetic */ DayTradeInfoStepsViewState copy$default(DayTradeInfoStepsViewState dayTradeInfoStepsViewState, DayTradeInfoStage dayTradeInfoStage, UiDayTradeInfo uiDayTradeInfo, boolean z, boolean z2, UiEvent uiEvent, UiEvent uiEvent2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            dayTradeInfoStage = dayTradeInfoStepsViewState.stage;
        }
        if ((i3 & 2) != 0) {
            uiDayTradeInfo = dayTradeInfoStepsViewState.dayTradeInfo;
        }
        if ((i3 & 4) != 0) {
            z = dayTradeInfoStepsViewState.canShowCashManagement;
        }
        if ((i3 & 8) != 0) {
            z2 = dayTradeInfoStepsViewState.cashManagementLimitedInterest;
        }
        if ((i3 & 16) != 0) {
            uiEvent = dayTradeInfoStepsViewState.pdtEnableChangeComplete;
        }
        if ((i3 & 32) != 0) {
            uiEvent2 = dayTradeInfoStepsViewState.pdtEnableChangeError;
        }
        if ((i3 & 64) != 0) {
            i = dayTradeInfoStepsViewState.selectedStep;
        }
        if ((i3 & 128) != 0) {
            i2 = dayTradeInfoStepsViewState.selectedVariant;
        }
        int i4 = i;
        int i5 = i2;
        UiEvent uiEvent3 = uiEvent;
        UiEvent uiEvent4 = uiEvent2;
        return dayTradeInfoStepsViewState.copy(dayTradeInfoStage, uiDayTradeInfo, z, z2, uiEvent3, uiEvent4, i4, i5);
    }

    public final UiEvent<Unit> component5() {
        return this.pdtEnableChangeComplete;
    }

    public final UiEvent<Unit> component6() {
        return this.pdtEnableChangeError;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSelectedStep() {
        return this.selectedStep;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSelectedVariant() {
        return this.selectedVariant;
    }

    public final DayTradeInfoStepsViewState copy(DayTradeInfoStage stage, UiDayTradeInfo dayTradeInfo, boolean canShowCashManagement, boolean cashManagementLimitedInterest, UiEvent<Unit> pdtEnableChangeComplete, UiEvent<Unit> pdtEnableChangeError, int selectedStep, int selectedVariant) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        return new DayTradeInfoStepsViewState(stage, dayTradeInfo, canShowCashManagement, cashManagementLimitedInterest, pdtEnableChangeComplete, pdtEnableChangeError, selectedStep, selectedVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayTradeInfoStepsViewState)) {
            return false;
        }
        DayTradeInfoStepsViewState dayTradeInfoStepsViewState = (DayTradeInfoStepsViewState) other;
        return this.stage == dayTradeInfoStepsViewState.stage && Intrinsics.areEqual(this.dayTradeInfo, dayTradeInfoStepsViewState.dayTradeInfo) && this.canShowCashManagement == dayTradeInfoStepsViewState.canShowCashManagement && this.cashManagementLimitedInterest == dayTradeInfoStepsViewState.cashManagementLimitedInterest && Intrinsics.areEqual(this.pdtEnableChangeComplete, dayTradeInfoStepsViewState.pdtEnableChangeComplete) && Intrinsics.areEqual(this.pdtEnableChangeError, dayTradeInfoStepsViewState.pdtEnableChangeError) && this.selectedStep == dayTradeInfoStepsViewState.selectedStep && this.selectedVariant == dayTradeInfoStepsViewState.selectedVariant;
    }

    public int hashCode() {
        int iHashCode = this.stage.hashCode() * 31;
        UiDayTradeInfo uiDayTradeInfo = this.dayTradeInfo;
        int iHashCode2 = (((((iHashCode + (uiDayTradeInfo == null ? 0 : uiDayTradeInfo.hashCode())) * 31) + Boolean.hashCode(this.canShowCashManagement)) * 31) + Boolean.hashCode(this.cashManagementLimitedInterest)) * 31;
        UiEvent<Unit> uiEvent = this.pdtEnableChangeComplete;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.pdtEnableChangeError;
        return ((((iHashCode3 + (uiEvent2 != null ? uiEvent2.hashCode() : 0)) * 31) + Integer.hashCode(this.selectedStep)) * 31) + Integer.hashCode(this.selectedVariant);
    }

    public String toString() {
        return "DayTradeInfoStepsViewState(stage=" + this.stage + ", dayTradeInfo=" + this.dayTradeInfo + ", canShowCashManagement=" + this.canShowCashManagement + ", cashManagementLimitedInterest=" + this.cashManagementLimitedInterest + ", pdtEnableChangeComplete=" + this.pdtEnableChangeComplete + ", pdtEnableChangeError=" + this.pdtEnableChangeError + ", selectedStep=" + this.selectedStep + ", selectedVariant=" + this.selectedVariant + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DayTradeInfoStepsViewState(DayTradeInfoStage stage, UiDayTradeInfo uiDayTradeInfo, boolean z, boolean z2, UiEvent<Unit> uiEvent, UiEvent<Unit> uiEvent2, int i, int i2) {
        List<UiDayTradeInfoStep> steps;
        boolean z3;
        UiDayTradeDisclosure disclosure;
        UiDayTradeInfoStep uiDayTradeInfoStep;
        Intrinsics.checkNotNullParameter(stage, "stage");
        this.stage = stage;
        this.dayTradeInfo = uiDayTradeInfo;
        this.canShowCashManagement = z;
        this.cashManagementLimitedInterest = z2;
        this.pdtEnableChangeComplete = uiEvent;
        this.pdtEnableChangeError = uiEvent2;
        this.selectedStep = i;
        this.selectedVariant = i2;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[stage.ordinal()];
        String buttonText = null;
        if (i3 == 1) {
            steps = null;
        } else if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (uiDayTradeInfo != null) {
                    steps = CollectionsKt.listOf(uiDayTradeInfo.getProtectionEnabledStep());
                }
            } else if (uiDayTradeInfo != null) {
                steps = CollectionsKt.listOf(uiDayTradeInfo.getRecommendProtectionStep());
            }
        } else if (uiDayTradeInfo != null) {
            if (z && z2) {
                steps = CollectionsKt.plus((Collection<? extends UiDayTradeInfoStep>) uiDayTradeInfo.getSteps(), uiDayTradeInfo.getCashManagementInterestStep());
            } else if (z) {
                steps = CollectionsKt.plus((Collection<? extends UiDayTradeInfoStep>) uiDayTradeInfo.getSteps(), uiDayTradeInfo.getCashManagementStep());
            } else {
                steps = uiDayTradeInfo.getSteps();
            }
        }
        this.steps = steps;
        List<UiDayTradeInfoVariant> variants = (steps == null || (uiDayTradeInfoStep = (UiDayTradeInfoStep) CollectionsKt.getOrNull(steps, i)) == null) ? null : uiDayTradeInfoStep.getVariants();
        this.variants = variants;
        int i4 = i + 1;
        this.currentStepProgress = i4;
        int size = steps != null ? steps.size() : 0;
        this.maxStepProgress = size;
        UiDayTradeInfoStep uiDayTradeInfoStep2 = steps != null ? (UiDayTradeInfoStep) CollectionsKt.getOrNull(steps, i) : null;
        this.currentStep = uiDayTradeInfoStep2;
        this.currentVariant = variants != null ? (UiDayTradeInfoVariant) CollectionsKt.getOrNull(variants, i2) : null;
        this.progressCurrent = i4;
        this.progressMax = size;
        int i5 = iArr[stage.ordinal()];
        if (i5 == 1) {
            z3 = false;
        } else if (i5 != 2) {
            if (i5 != 3) {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                z3 = false;
            }
            z3 = true;
        } else if (i4 < size) {
            z3 = true;
        }
        this.showSkip = z3;
        if (uiDayTradeInfoStep2 != null && (disclosure = uiDayTradeInfoStep2.getDisclosure()) != null) {
            buttonText = disclosure.getButtonText();
        }
        this.showDisclosureModal = buttonText != null;
        this.showProgressBar = stage == DayTradeInfoStage.TUTORIAL_STEPS;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DayTradeInfoStepsViewState(com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoStage r3, com.robinhood.android.margin.model.UiDayTradeInfo r4, boolean r5, boolean r6, com.robinhood.udf.UiEvent r7, com.robinhood.udf.UiEvent r8, int r9, int r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r2 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            com.robinhood.android.margin.ui.daytrade.DayTradeInfoStage r3 = com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoStage.INTRO
        L6:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto Lc
            r4 = r0
        Lc:
            r12 = r11 & 4
            r1 = 0
            if (r12 == 0) goto L12
            r5 = r1
        L12:
            r12 = r11 & 8
            if (r12 == 0) goto L17
            r6 = r1
        L17:
            r12 = r11 & 16
            if (r12 == 0) goto L1c
            r7 = r0
        L1c:
            r12 = r11 & 32
            if (r12 == 0) goto L21
            r8 = r0
        L21:
            r12 = r11 & 64
            if (r12 == 0) goto L26
            r9 = r1
        L26:
            r11 = r11 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L34
            r12 = r1
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            goto L3d
        L34:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L3d:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.margin.p174ui.daytrade.DayTradeInfoStepsViewState.<init>(com.robinhood.android.margin.ui.daytrade.DayTradeInfoStage, com.robinhood.android.margin.model.UiDayTradeInfo, boolean, boolean, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final UiEvent<Unit> getPdtEnableChangeComplete() {
        return this.pdtEnableChangeComplete;
    }

    public final UiEvent<Unit> getPdtEnableChangeError() {
        return this.pdtEnableChangeError;
    }

    public final int getSelectedStep() {
        return this.selectedStep;
    }

    public final int getSelectedVariant() {
        return this.selectedVariant;
    }

    public final List<UiDayTradeInfoStep> getSteps() {
        return this.steps;
    }

    public final List<UiDayTradeInfoVariant> getVariants() {
        return this.variants;
    }

    public final int getCurrentStepProgress() {
        return this.currentStepProgress;
    }

    public final int getMaxStepProgress() {
        return this.maxStepProgress;
    }

    public final ContinueButtonAction getContinueButtonAction() {
        if (this.dayTradeInfo == null) {
            return null;
        }
        DayTradeInfoStage dayTradeInfoStage = this.stage;
        return dayTradeInfoStage == DayTradeInfoStage.PROTECTION_ENABLED ? ContinueButtonAction.Confirm.INSTANCE : dayTradeInfoStage == DayTradeInfoStage.RECOMMEND_PROTECTION ? ContinueButtonAction.EnablePdt.INSTANCE : this.currentStepProgress == this.maxStepProgress ? ContinueButtonAction.Complete.INSTANCE : new ContinueButtonAction.Next(this.selectedStep + 1);
    }

    public final UiDayTradeInfoStep getCurrentStep() {
        return this.currentStep;
    }

    public final UiDayTradeInfoVariant getCurrentVariant() {
        return this.currentVariant;
    }

    public final int getProgressCurrent() {
        return this.progressCurrent;
    }

    public final int getProgressMax() {
        return this.progressMax;
    }

    public final boolean getShowSkip() {
        return this.showSkip;
    }

    public final boolean getShowDisclosureModal() {
        return this.showDisclosureModal;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    /* compiled from: DayTradeInfoStepsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction;", "", "<init>", "()V", "Next", "Complete", "Confirm", "EnablePdt", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction$Complete;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction$Confirm;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction$EnablePdt;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction$Next;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ContinueButtonAction {
        public static final int $stable = 0;

        public /* synthetic */ ContinueButtonAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ContinueButtonAction() {
        }

        /* compiled from: DayTradeInfoStepsViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction$Next;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction;", "nextPage", "", "<init>", "(I)V", "getNextPage", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Next extends ContinueButtonAction {
            public static final int $stable = 0;
            private final int nextPage;

            public static /* synthetic */ Next copy$default(Next next, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = next.nextPage;
                }
                return next.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getNextPage() {
                return this.nextPage;
            }

            public final Next copy(int nextPage) {
                return new Next(nextPage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Next) && this.nextPage == ((Next) other).nextPage;
            }

            public int hashCode() {
                return Integer.hashCode(this.nextPage);
            }

            public String toString() {
                return "Next(nextPage=" + this.nextPage + ")";
            }

            public Next(int i) {
                super(null);
                this.nextPage = i;
            }

            public final int getNextPage() {
                return this.nextPage;
            }
        }

        /* compiled from: DayTradeInfoStepsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction$Complete;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Complete extends ContinueButtonAction {
            public static final int $stable = 0;
            public static final Complete INSTANCE = new Complete();

            private Complete() {
                super(null);
            }
        }

        /* compiled from: DayTradeInfoStepsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction$Confirm;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Confirm extends ContinueButtonAction {
            public static final int $stable = 0;
            public static final Confirm INSTANCE = new Confirm();

            private Confirm() {
                super(null);
            }
        }

        /* compiled from: DayTradeInfoStepsViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction$EnablePdt;", "Lcom/robinhood/android/margin/ui/daytrade/DayTradeInfoStepsViewState$ContinueButtonAction;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EnablePdt extends ContinueButtonAction {
            public static final int $stable = 0;
            public static final EnablePdt INSTANCE = new EnablePdt();

            private EnablePdt() {
                super(null);
            }
        }
    }
}
