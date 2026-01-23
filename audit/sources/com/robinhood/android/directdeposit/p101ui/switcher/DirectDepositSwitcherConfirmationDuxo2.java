package com.robinhood.android.directdeposit.p101ui.switcher;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.directdeposit.C11131R;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.models.api.bonfire.ApiEarlyPayEnrollment;
import com.robinhood.models.p320db.EarlyPayEnrollment;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositSwitcherConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationState;", "", "fullScreenLoading", "", "<init>", "(Z)V", "getFullScreenLoading", "()Z", "Loading", "Loaded", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationState$Loaded;", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationState$Loading;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationState, reason: use source file name */
/* loaded from: classes27.dex */
public abstract class DirectDepositSwitcherConfirmationDuxo2 {
    public static final int $stable = 0;
    private final boolean fullScreenLoading;

    public /* synthetic */ DirectDepositSwitcherConfirmationDuxo2(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private DirectDepositSwitcherConfirmationDuxo2(boolean z) {
        this.fullScreenLoading = z;
    }

    public final boolean getFullScreenLoading() {
        return this.fullScreenLoading;
    }

    /* compiled from: DirectDepositSwitcherConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationState$Loading;", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationState;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationState$Loading */
    public static final class Loading extends DirectDepositSwitcherConfirmationDuxo2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(true, null);
        }
    }

    /* compiled from: DirectDepositSwitcherConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u0007HÆ\u0003JS\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0019HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001f\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationState$Loaded;", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationState;", "showEarlyPayHook", "", "earlyPayEnrollment", "Lcom/robinhood/models/db/EarlyPayEnrollment;", "finishEvent", "Lcom/robinhood/udf/UiEvent;", "", "primaryButtonLoading", "earlyPayEnrollmentEvent", "Lkotlin/Result;", "Lcom/robinhood/models/api/bonfire/ApiEarlyPayEnrollment;", "<init>", "(ZLcom/robinhood/models/db/EarlyPayEnrollment;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/udf/UiEvent;)V", "getShowEarlyPayHook", "()Z", "getEarlyPayEnrollment", "()Lcom/robinhood/models/db/EarlyPayEnrollment;", "getFinishEvent", "()Lcom/robinhood/udf/UiEvent;", "getPrimaryButtonLoading", "getEarlyPayEnrollmentEvent", "isEarlyPayHookVisible", "illustrationResId", "", "getIllustrationResId", "()I", "titleResId", "getTitleResId", "descriptionResId", "getDescriptionResId", "primaryButtonResId", "getPrimaryButtonResId", "secondaryButtonResId", "getSecondaryButtonResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends DirectDepositSwitcherConfirmationDuxo2 {
        public static final int $stable = 8;
        private final int descriptionResId;
        private final EarlyPayEnrollment earlyPayEnrollment;
        private final UiEvent<Result<ApiEarlyPayEnrollment>> earlyPayEnrollmentEvent;
        private final UiEvent<Unit> finishEvent;
        private final int illustrationResId;
        private final boolean isEarlyPayHookVisible;
        private final boolean primaryButtonLoading;
        private final int primaryButtonResId;
        private final Integer secondaryButtonResId;
        private final boolean showEarlyPayHook;
        private final int titleResId;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, boolean z, EarlyPayEnrollment earlyPayEnrollment, UiEvent uiEvent, boolean z2, UiEvent uiEvent2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loaded.showEarlyPayHook;
            }
            if ((i & 2) != 0) {
                earlyPayEnrollment = loaded.earlyPayEnrollment;
            }
            if ((i & 4) != 0) {
                uiEvent = loaded.finishEvent;
            }
            if ((i & 8) != 0) {
                z2 = loaded.primaryButtonLoading;
            }
            if ((i & 16) != 0) {
                uiEvent2 = loaded.earlyPayEnrollmentEvent;
            }
            UiEvent uiEvent3 = uiEvent2;
            UiEvent uiEvent4 = uiEvent;
            return loaded.copy(z, earlyPayEnrollment, uiEvent4, z2, uiEvent3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowEarlyPayHook() {
            return this.showEarlyPayHook;
        }

        /* renamed from: component2, reason: from getter */
        public final EarlyPayEnrollment getEarlyPayEnrollment() {
            return this.earlyPayEnrollment;
        }

        public final UiEvent<Unit> component3() {
            return this.finishEvent;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getPrimaryButtonLoading() {
            return this.primaryButtonLoading;
        }

        public final UiEvent<Result<ApiEarlyPayEnrollment>> component5() {
            return this.earlyPayEnrollmentEvent;
        }

        public final Loaded copy(boolean showEarlyPayHook, EarlyPayEnrollment earlyPayEnrollment, UiEvent<Unit> finishEvent, boolean primaryButtonLoading, UiEvent<Result<ApiEarlyPayEnrollment>> earlyPayEnrollmentEvent) {
            return new Loaded(showEarlyPayHook, earlyPayEnrollment, finishEvent, primaryButtonLoading, earlyPayEnrollmentEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.showEarlyPayHook == loaded.showEarlyPayHook && Intrinsics.areEqual(this.earlyPayEnrollment, loaded.earlyPayEnrollment) && Intrinsics.areEqual(this.finishEvent, loaded.finishEvent) && this.primaryButtonLoading == loaded.primaryButtonLoading && Intrinsics.areEqual(this.earlyPayEnrollmentEvent, loaded.earlyPayEnrollmentEvent);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.showEarlyPayHook) * 31;
            EarlyPayEnrollment earlyPayEnrollment = this.earlyPayEnrollment;
            int iHashCode2 = (iHashCode + (earlyPayEnrollment == null ? 0 : earlyPayEnrollment.hashCode())) * 31;
            UiEvent<Unit> uiEvent = this.finishEvent;
            int iHashCode3 = (((iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.primaryButtonLoading)) * 31;
            UiEvent<Result<ApiEarlyPayEnrollment>> uiEvent2 = this.earlyPayEnrollmentEvent;
            return iHashCode3 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(showEarlyPayHook=" + this.showEarlyPayHook + ", earlyPayEnrollment=" + this.earlyPayEnrollment + ", finishEvent=" + this.finishEvent + ", primaryButtonLoading=" + this.primaryButtonLoading + ", earlyPayEnrollmentEvent=" + this.earlyPayEnrollmentEvent + ")";
        }

        public /* synthetic */ Loaded(boolean z, EarlyPayEnrollment earlyPayEnrollment, UiEvent uiEvent, boolean z2, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : earlyPayEnrollment, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : uiEvent2);
        }

        public final boolean getShowEarlyPayHook() {
            return this.showEarlyPayHook;
        }

        public final EarlyPayEnrollment getEarlyPayEnrollment() {
            return this.earlyPayEnrollment;
        }

        public final UiEvent<Unit> getFinishEvent() {
            return this.finishEvent;
        }

        public final boolean getPrimaryButtonLoading() {
            return this.primaryButtonLoading;
        }

        public final UiEvent<Result<ApiEarlyPayEnrollment>> getEarlyPayEnrollmentEvent() {
            return this.earlyPayEnrollmentEvent;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(boolean z, EarlyPayEnrollment earlyPayEnrollment, UiEvent<Unit> uiEvent, boolean z2, UiEvent<Result<ApiEarlyPayEnrollment>> uiEvent2) {
            int i;
            int i2;
            int i3;
            boolean z3 = false;
            super(z3, 0 == true ? 1 : 0);
            this.showEarlyPayHook = z;
            this.earlyPayEnrollment = earlyPayEnrollment;
            this.finishEvent = uiEvent;
            this.primaryButtonLoading = z2;
            this.earlyPayEnrollmentEvent = uiEvent2;
            if (z && earlyPayEnrollment != null && !earlyPayEnrollment.isEnrolled()) {
                z3 = true;
            }
            this.isEarlyPayHookVisible = z3;
            if (!z3) {
                i = C14044R.drawable.svg_direct_deposit_success;
            } else {
                i = C11131R.drawable.svg_fireworks;
            }
            this.illustrationResId = i;
            this.titleResId = C14044R.string.direct_deposit_switcher_success_title;
            if (!z3) {
                i2 = C14044R.string.direct_deposit_switcher_confirmation_description;
            } else {
                i2 = C14044R.string.direct_deposit_switcher_confirmation_early_pay_description;
            }
            this.descriptionResId = i2;
            if (!z3) {
                i3 = C11048R.string.general_label_done;
            } else {
                i3 = C11048R.string.general_label_sign_up;
            }
            this.primaryButtonResId = i3;
            this.secondaryButtonResId = z3 ? Integer.valueOf(C11257R.string.cash_management_general_label_maybe_later) : null;
        }

        /* renamed from: isEarlyPayHookVisible, reason: from getter */
        public final boolean getIsEarlyPayHookVisible() {
            return this.isEarlyPayHookVisible;
        }

        public final int getIllustrationResId() {
            return this.illustrationResId;
        }

        public final int getTitleResId() {
            return this.titleResId;
        }

        public final int getDescriptionResId() {
            return this.descriptionResId;
        }

        public final int getPrimaryButtonResId() {
            return this.primaryButtonResId;
        }

        public final Integer getSecondaryButtonResId() {
            return this.secondaryButtonResId;
        }
    }
}
