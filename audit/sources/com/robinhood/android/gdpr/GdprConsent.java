package com.robinhood.android.gdpr;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.GDPRConsentManagementContext;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GdprConsent.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/gdpr/GdprConsent;", "", "functional", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "marketing", "performance", "<init>", "(Lcom/robinhood/android/gdpr/GdprConsentStatus;Lcom/robinhood/android/gdpr/GdprConsentStatus;Lcom/robinhood/android/gdpr/GdprConsentStatus;)V", "getFunctional", "()Lcom/robinhood/android/gdpr/GdprConsentStatus;", "getMarketing", "getPerformance", "hasCollectedConsent", "", "getHasCollectedConsent", "()Z", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "lib-gdpr_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final /* data */ class GdprConsent {
    private static final GdprConsent ALL_GRANTED;
    private static final GdprConsent ALL_REJECTED;
    private static final GdprConsent ALL_UNKNOWN;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final GdprConsentStatus functional;
    private final GdprConsentStatus marketing;
    private final GdprConsentStatus performance;

    public static /* synthetic */ GdprConsent copy$default(GdprConsent gdprConsent, GdprConsentStatus gdprConsentStatus, GdprConsentStatus gdprConsentStatus2, GdprConsentStatus gdprConsentStatus3, int i, Object obj) {
        if ((i & 1) != 0) {
            gdprConsentStatus = gdprConsent.functional;
        }
        if ((i & 2) != 0) {
            gdprConsentStatus2 = gdprConsent.marketing;
        }
        if ((i & 4) != 0) {
            gdprConsentStatus3 = gdprConsent.performance;
        }
        return gdprConsent.copy(gdprConsentStatus, gdprConsentStatus2, gdprConsentStatus3);
    }

    /* renamed from: component1, reason: from getter */
    public final GdprConsentStatus getFunctional() {
        return this.functional;
    }

    /* renamed from: component2, reason: from getter */
    public final GdprConsentStatus getMarketing() {
        return this.marketing;
    }

    /* renamed from: component3, reason: from getter */
    public final GdprConsentStatus getPerformance() {
        return this.performance;
    }

    public final GdprConsent copy(GdprConsentStatus functional, GdprConsentStatus marketing, GdprConsentStatus performance) {
        Intrinsics.checkNotNullParameter(functional, "functional");
        Intrinsics.checkNotNullParameter(marketing, "marketing");
        Intrinsics.checkNotNullParameter(performance, "performance");
        return new GdprConsent(functional, marketing, performance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GdprConsent)) {
            return false;
        }
        GdprConsent gdprConsent = (GdprConsent) other;
        return this.functional == gdprConsent.functional && this.marketing == gdprConsent.marketing && this.performance == gdprConsent.performance;
    }

    public int hashCode() {
        return (((this.functional.hashCode() * 31) + this.marketing.hashCode()) * 31) + this.performance.hashCode();
    }

    public String toString() {
        return "GdprConsent(functional=" + this.functional + ", marketing=" + this.marketing + ", performance=" + this.performance + ")";
    }

    public GdprConsent(GdprConsentStatus functional, GdprConsentStatus marketing, GdprConsentStatus performance) {
        Intrinsics.checkNotNullParameter(functional, "functional");
        Intrinsics.checkNotNullParameter(marketing, "marketing");
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.functional = functional;
        this.marketing = marketing;
        this.performance = performance;
    }

    public final GdprConsentStatus getFunctional() {
        return this.functional;
    }

    public final GdprConsentStatus getMarketing() {
        return this.marketing;
    }

    public final GdprConsentStatus getPerformance() {
        return this.performance;
    }

    public final boolean getHasCollectedConsent() {
        return this.functional.getIsCollected() && this.marketing.getIsCollected() && this.performance.getIsCollected();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Context getLoggingContext() {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new GDPRConsentManagementContext(CollectionsKt.listOfNotNull((Object[]) new String[]{this.functional.getIsEnabled() ? "functional" : null, this.marketing.getIsEnabled() ? "marketing" : null, this.performance.getIsEnabled() ? "performance" : null, "strictlyNecessary"}), null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -2097153, -1, 16383, null);
    }

    /* compiled from: GdprConsent.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gdpr/GdprConsent$Companion;", "", "<init>", "()V", "ALL_GRANTED", "Lcom/robinhood/android/gdpr/GdprConsent;", "getALL_GRANTED", "()Lcom/robinhood/android/gdpr/GdprConsent;", "ALL_REJECTED", "getALL_REJECTED", "ALL_UNKNOWN", "getALL_UNKNOWN", "lib-gdpr_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GdprConsent getALL_GRANTED() {
            return GdprConsent.ALL_GRANTED;
        }

        public final GdprConsent getALL_REJECTED() {
            return GdprConsent.ALL_REJECTED;
        }

        public final GdprConsent getALL_UNKNOWN() {
            return GdprConsent.ALL_UNKNOWN;
        }
    }

    static {
        GdprConsentStatus gdprConsentStatus = GdprConsentStatus.GRANTED;
        ALL_GRANTED = new GdprConsent(gdprConsentStatus, gdprConsentStatus, gdprConsentStatus);
        GdprConsentStatus gdprConsentStatus2 = GdprConsentStatus.REJECTED;
        ALL_REJECTED = new GdprConsent(gdprConsentStatus2, gdprConsentStatus2, gdprConsentStatus2);
        GdprConsentStatus gdprConsentStatus3 = GdprConsentStatus.UNKNOWN;
        ALL_UNKNOWN = new GdprConsent(gdprConsentStatus3, gdprConsentStatus3, gdprConsentStatus3);
    }
}
