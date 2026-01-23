package com.robinhood.android.onboarding.gold.nativefunding.upsell;

import com.robinhood.android.api.gold.nativefunding.upsell.ApiGoldNativeFundingUpsell;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldNativeFundingUpsellLoadingEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingEvent;", "", "<init>", "()V", "Loaded", "Failed", "Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingEvent$Failed;", "Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingEvent$Loaded;", "feature-gold-native-funding-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GoldNativeFundingUpsellLoadingEvent {
    public static final int $stable = 0;

    public /* synthetic */ GoldNativeFundingUpsellLoadingEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GoldNativeFundingUpsellLoadingEvent() {
    }

    /* compiled from: GoldNativeFundingUpsellLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingEvent$Loaded;", "Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingEvent;", "goldNativeFundingUpsellFlow", "Lcom/robinhood/android/api/gold/nativefunding/upsell/ApiGoldNativeFundingUpsell;", "<init>", "(Lcom/robinhood/android/api/gold/nativefunding/upsell/ApiGoldNativeFundingUpsell;)V", "getGoldNativeFundingUpsellFlow", "()Lcom/robinhood/android/api/gold/nativefunding/upsell/ApiGoldNativeFundingUpsell;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-native-funding-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends GoldNativeFundingUpsellLoadingEvent {
        public static final int $stable = 8;
        private final ApiGoldNativeFundingUpsell goldNativeFundingUpsellFlow;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiGoldNativeFundingUpsell apiGoldNativeFundingUpsell, int i, Object obj) {
            if ((i & 1) != 0) {
                apiGoldNativeFundingUpsell = loaded.goldNativeFundingUpsellFlow;
            }
            return loaded.copy(apiGoldNativeFundingUpsell);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiGoldNativeFundingUpsell getGoldNativeFundingUpsellFlow() {
            return this.goldNativeFundingUpsellFlow;
        }

        public final Loaded copy(ApiGoldNativeFundingUpsell goldNativeFundingUpsellFlow) {
            Intrinsics.checkNotNullParameter(goldNativeFundingUpsellFlow, "goldNativeFundingUpsellFlow");
            return new Loaded(goldNativeFundingUpsellFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.goldNativeFundingUpsellFlow, ((Loaded) other).goldNativeFundingUpsellFlow);
        }

        public int hashCode() {
            return this.goldNativeFundingUpsellFlow.hashCode();
        }

        public String toString() {
            return "Loaded(goldNativeFundingUpsellFlow=" + this.goldNativeFundingUpsellFlow + ")";
        }

        public final ApiGoldNativeFundingUpsell getGoldNativeFundingUpsellFlow() {
            return this.goldNativeFundingUpsellFlow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(ApiGoldNativeFundingUpsell goldNativeFundingUpsellFlow) {
            super(null);
            Intrinsics.checkNotNullParameter(goldNativeFundingUpsellFlow, "goldNativeFundingUpsellFlow");
            this.goldNativeFundingUpsellFlow = goldNativeFundingUpsellFlow;
        }
    }

    /* compiled from: GoldNativeFundingUpsellLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingEvent$Failed;", "Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-native-funding-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failed extends GoldNativeFundingUpsellLoadingEvent {
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
