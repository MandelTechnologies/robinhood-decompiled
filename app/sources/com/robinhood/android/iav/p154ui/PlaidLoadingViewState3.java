package com.robinhood.android.iav.p154ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidLoadingViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/Status;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/android/iav/ui/Status$Loaded;", "Lcom/robinhood/android/iav/ui/Status$Loading;", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.iav.ui.Status, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class PlaidLoadingViewState3 {
    public static final int $stable = 0;

    public /* synthetic */ PlaidLoadingViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PlaidLoadingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/Status$Loading;", "Lcom/robinhood/android/iav/ui/Status;", "<init>", "()V", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.iav.ui.Status$Loading */
    public static final class Loading extends PlaidLoadingViewState3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private PlaidLoadingViewState3() {
    }

    /* compiled from: PlaidLoadingViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/Status$Loaded;", "Lcom/robinhood/android/iav/ui/Status;", "action", "Lcom/robinhood/android/iav/ui/Action;", "<init>", "(Lcom/robinhood/android/iav/ui/Action;)V", "getAction", "()Lcom/robinhood/android/iav/ui/Action;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.iav.ui.Status$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends PlaidLoadingViewState3 {
        public static final int $stable = 0;
        private final PlaidLoadingViewState2 action;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, PlaidLoadingViewState2 plaidLoadingViewState2, int i, Object obj) {
            if ((i & 1) != 0) {
                plaidLoadingViewState2 = loaded.action;
            }
            return loaded.copy(plaidLoadingViewState2);
        }

        /* renamed from: component1, reason: from getter */
        public final PlaidLoadingViewState2 getAction() {
            return this.action;
        }

        public final Loaded copy(PlaidLoadingViewState2 action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new Loaded(action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && this.action == ((Loaded) other).action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return "Loaded(action=" + this.action + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(PlaidLoadingViewState2 action) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public final PlaidLoadingViewState2 getAction() {
            return this.action;
        }
    }
}
