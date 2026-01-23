package com.robinhood.android.gold.upgrade.agreements.switchplan;

import com.robinhood.android.gold.subscription.api.GoldSwitchSubscriptionPlanResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSwitchPlanAlertSheetEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetEvent;", "", "<init>", "()V", "SwitchComplete", "Failed", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetEvent$Failed;", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetEvent$SwitchComplete;", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GoldSwitchPlanAlertSheetEvent {
    public static final int $stable = 0;

    public /* synthetic */ GoldSwitchPlanAlertSheetEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GoldSwitchPlanAlertSheetEvent() {
    }

    /* compiled from: GoldSwitchPlanAlertSheetEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetEvent$SwitchComplete;", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetEvent;", "result", "Lcom/robinhood/android/gold/subscription/api/GoldSwitchSubscriptionPlanResponse;", "<init>", "(Lcom/robinhood/android/gold/subscription/api/GoldSwitchSubscriptionPlanResponse;)V", "getResult", "()Lcom/robinhood/android/gold/subscription/api/GoldSwitchSubscriptionPlanResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SwitchComplete extends GoldSwitchPlanAlertSheetEvent {
        public static final int $stable = 8;
        private final GoldSwitchSubscriptionPlanResponse result;

        public static /* synthetic */ SwitchComplete copy$default(SwitchComplete switchComplete, GoldSwitchSubscriptionPlanResponse goldSwitchSubscriptionPlanResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                goldSwitchSubscriptionPlanResponse = switchComplete.result;
            }
            return switchComplete.copy(goldSwitchSubscriptionPlanResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final GoldSwitchSubscriptionPlanResponse getResult() {
            return this.result;
        }

        public final SwitchComplete copy(GoldSwitchSubscriptionPlanResponse result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new SwitchComplete(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SwitchComplete) && Intrinsics.areEqual(this.result, ((SwitchComplete) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "SwitchComplete(result=" + this.result + ")";
        }

        public final GoldSwitchSubscriptionPlanResponse getResult() {
            return this.result;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchComplete(GoldSwitchSubscriptionPlanResponse result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }
    }

    /* compiled from: GoldSwitchPlanAlertSheetEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetEvent$Failed;", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failed extends GoldSwitchPlanAlertSheetEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failed.error;
            }
            return failed.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Failed copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failed(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.error + ")";
        }

        public final Throwable getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }
    }
}
