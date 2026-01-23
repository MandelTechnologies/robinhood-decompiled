package com.robinhood.android.redesigninvesting.badges.p230ui;

import com.robinhood.android.redesigninvesting.models.badges.InvestingBadge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: InvestingBadgeViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeViewState;", "", "<init>", "()V", "Badge", "NoBadge", "Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeViewState$Badge;", "Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeViewState$NoBadge;", "lib-badges-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class InvestingBadgeViewState {
    public static final int $stable = 0;

    public /* synthetic */ InvestingBadgeViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InvestingBadgeViewState() {
    }

    /* compiled from: InvestingBadgeViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeViewState$Badge;", "Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeViewState;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/redesigninvesting/models/badges/InvestingBadge;", "<init>", "(Lcom/robinhood/android/redesigninvesting/models/badges/InvestingBadge;)V", "getDetails", "()Lcom/robinhood/android/redesigninvesting/models/badges/InvestingBadge;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-badges-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Badge extends InvestingBadgeViewState {
        public static final int $stable = 8;
        private final InvestingBadge details;

        public static /* synthetic */ Badge copy$default(Badge badge, InvestingBadge investingBadge, int i, Object obj) {
            if ((i & 1) != 0) {
                investingBadge = badge.details;
            }
            return badge.copy(investingBadge);
        }

        /* renamed from: component1, reason: from getter */
        public final InvestingBadge getDetails() {
            return this.details;
        }

        public final Badge copy(InvestingBadge details) {
            Intrinsics.checkNotNullParameter(details, "details");
            return new Badge(details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Badge) && Intrinsics.areEqual(this.details, ((Badge) other).details);
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        public String toString() {
            return "Badge(details=" + this.details + ")";
        }

        public final InvestingBadge getDetails() {
            return this.details;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Badge(InvestingBadge details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }
    }

    /* compiled from: InvestingBadgeViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeViewState$NoBadge;", "Lcom/robinhood/android/redesigninvesting/badges/ui/InvestingBadgeViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-badges-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NoBadge extends InvestingBadgeViewState {
        public static final int $stable = 0;
        public static final NoBadge INSTANCE = new NoBadge();

        public boolean equals(Object other) {
            return this == other || (other instanceof NoBadge);
        }

        public int hashCode() {
            return 1164403976;
        }

        public String toString() {
            return "NoBadge";
        }

        private NoBadge() {
            super(null);
        }
    }
}
