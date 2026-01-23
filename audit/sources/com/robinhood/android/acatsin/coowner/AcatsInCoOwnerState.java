package com.robinhood.android.acatsin.coowner;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInCoOwnerState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerEvent;", "", "<init>", "()V", "FlowNavigation", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerEvent$FlowNavigation;", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.coowner.AcatsInCoOwnerEvent, reason: use source file name */
/* loaded from: classes24.dex */
public abstract class AcatsInCoOwnerState {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInCoOwnerState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AcatsInCoOwnerState() {
    }

    /* compiled from: AcatsInCoOwnerState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerEvent$FlowNavigation;", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerEvent;", "nextStep", "Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep;", "<init>", "(Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep;)V", "getNextStep", "()Lcom/robinhood/android/acatsin/coowner/AcatsInCoOwnerStep;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.coowner.AcatsInCoOwnerEvent$FlowNavigation, reason: from toString */
    public static final /* data */ class FlowNavigation extends AcatsInCoOwnerState {
        public static final int $stable = 0;
        private final AcatsInCoOwnerState2 nextStep;

        public static /* synthetic */ FlowNavigation copy$default(FlowNavigation flowNavigation, AcatsInCoOwnerState2 acatsInCoOwnerState2, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInCoOwnerState2 = flowNavigation.nextStep;
            }
            return flowNavigation.copy(acatsInCoOwnerState2);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInCoOwnerState2 getNextStep() {
            return this.nextStep;
        }

        public final FlowNavigation copy(AcatsInCoOwnerState2 nextStep) {
            Intrinsics.checkNotNullParameter(nextStep, "nextStep");
            return new FlowNavigation(nextStep);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FlowNavigation) && Intrinsics.areEqual(this.nextStep, ((FlowNavigation) other).nextStep);
        }

        public int hashCode() {
            return this.nextStep.hashCode();
        }

        public String toString() {
            return "FlowNavigation(nextStep=" + this.nextStep + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlowNavigation(AcatsInCoOwnerState2 nextStep) {
            super(null);
            Intrinsics.checkNotNullParameter(nextStep, "nextStep");
            this.nextStep = nextStep;
        }

        public final AcatsInCoOwnerState2 getNextStep() {
            return this.nextStep;
        }
    }
}
