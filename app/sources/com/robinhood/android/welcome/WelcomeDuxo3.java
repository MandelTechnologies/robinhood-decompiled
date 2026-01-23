package com.robinhood.android.welcome;

import com.robinhood.android.api.swipeycontent.SwipeyContent;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeDuxoEvent;", "", "<init>", "()V", "NavigateTo", "HandleDeeplink", "RegionLoadingCompleted", "Lcom/robinhood/android/welcome/WelcomeDuxoEvent$HandleDeeplink;", "Lcom/robinhood/android/welcome/WelcomeDuxoEvent$NavigateTo;", "Lcom/robinhood/android/welcome/WelcomeDuxoEvent$RegionLoadingCompleted;", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.welcome.WelcomeDuxoEvent, reason: use source file name */
/* loaded from: classes20.dex */
public abstract class WelcomeDuxo3 {
    public /* synthetic */ WelcomeDuxo3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WelcomeDuxo3() {
    }

    /* compiled from: WelcomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeDuxoEvent$NavigateTo;", "Lcom/robinhood/android/welcome/WelcomeDuxoEvent;", "key", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.welcome.WelcomeDuxoEvent$NavigateTo, reason: from toString */
    public static final /* data */ class NavigateTo extends WelcomeDuxo3 {
        private final IntentKey key;

        public static /* synthetic */ NavigateTo copy$default(NavigateTo navigateTo, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = navigateTo.key;
            }
            return navigateTo.copy(intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getKey() {
            return this.key;
        }

        public final NavigateTo copy(IntentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new NavigateTo(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateTo) && Intrinsics.areEqual(this.key, ((NavigateTo) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "NavigateTo(key=" + this.key + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateTo(IntentKey key) {
            super(null);
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final IntentKey getKey() {
            return this.key;
        }
    }

    /* compiled from: WelcomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeDuxoEvent$HandleDeeplink;", "Lcom/robinhood/android/welcome/WelcomeDuxoEvent;", "deeplink", "", "<init>", "(Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.welcome.WelcomeDuxoEvent$HandleDeeplink, reason: from toString */
    /* loaded from: classes9.dex */
    public static final /* data */ class HandleDeeplink extends WelcomeDuxo3 {
        private final String deeplink;

        public static /* synthetic */ HandleDeeplink copy$default(HandleDeeplink handleDeeplink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = handleDeeplink.deeplink;
            }
            return handleDeeplink.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final HandleDeeplink copy(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new HandleDeeplink(deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleDeeplink) && Intrinsics.areEqual(this.deeplink, ((HandleDeeplink) other).deeplink);
        }

        public int hashCode() {
            return this.deeplink.hashCode();
        }

        public String toString() {
            return "HandleDeeplink(deeplink=" + this.deeplink + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleDeeplink(String deeplink) {
            super(null);
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }
    }

    /* compiled from: WelcomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeDuxoEvent$RegionLoadingCompleted;", "Lcom/robinhood/android/welcome/WelcomeDuxoEvent;", "isGb", "", "hideSwipey", "swipeyContent", "Lcom/robinhood/android/api/swipeycontent/SwipeyContent;", "isRebrand", "<init>", "(ZZLcom/robinhood/android/api/swipeycontent/SwipeyContent;Z)V", "()Z", "getHideSwipey", "getSwipeyContent", "()Lcom/robinhood/android/api/swipeycontent/SwipeyContent;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.welcome.WelcomeDuxoEvent$RegionLoadingCompleted, reason: from toString */
    public static final /* data */ class RegionLoadingCompleted extends WelcomeDuxo3 {
        private final boolean hideSwipey;
        private final boolean isGb;
        private final boolean isRebrand;
        private final SwipeyContent swipeyContent;

        public static /* synthetic */ RegionLoadingCompleted copy$default(RegionLoadingCompleted regionLoadingCompleted, boolean z, boolean z2, SwipeyContent swipeyContent, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = regionLoadingCompleted.isGb;
            }
            if ((i & 2) != 0) {
                z2 = regionLoadingCompleted.hideSwipey;
            }
            if ((i & 4) != 0) {
                swipeyContent = regionLoadingCompleted.swipeyContent;
            }
            if ((i & 8) != 0) {
                z3 = regionLoadingCompleted.isRebrand;
            }
            return regionLoadingCompleted.copy(z, z2, swipeyContent, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsGb() {
            return this.isGb;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHideSwipey() {
            return this.hideSwipey;
        }

        /* renamed from: component3, reason: from getter */
        public final SwipeyContent getSwipeyContent() {
            return this.swipeyContent;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsRebrand() {
            return this.isRebrand;
        }

        public final RegionLoadingCompleted copy(boolean isGb, boolean hideSwipey, SwipeyContent swipeyContent, boolean isRebrand) {
            return new RegionLoadingCompleted(isGb, hideSwipey, swipeyContent, isRebrand);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RegionLoadingCompleted)) {
                return false;
            }
            RegionLoadingCompleted regionLoadingCompleted = (RegionLoadingCompleted) other;
            return this.isGb == regionLoadingCompleted.isGb && this.hideSwipey == regionLoadingCompleted.hideSwipey && Intrinsics.areEqual(this.swipeyContent, regionLoadingCompleted.swipeyContent) && this.isRebrand == regionLoadingCompleted.isRebrand;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.isGb) * 31) + Boolean.hashCode(this.hideSwipey)) * 31;
            SwipeyContent swipeyContent = this.swipeyContent;
            return ((iHashCode + (swipeyContent == null ? 0 : swipeyContent.hashCode())) * 31) + Boolean.hashCode(this.isRebrand);
        }

        public String toString() {
            return "RegionLoadingCompleted(isGb=" + this.isGb + ", hideSwipey=" + this.hideSwipey + ", swipeyContent=" + this.swipeyContent + ", isRebrand=" + this.isRebrand + ")";
        }

        public /* synthetic */ RegionLoadingCompleted(boolean z, boolean z2, SwipeyContent swipeyContent, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : swipeyContent, (i & 8) != 0 ? false : z3);
        }

        public final boolean isGb() {
            return this.isGb;
        }

        public final boolean getHideSwipey() {
            return this.hideSwipey;
        }

        public final SwipeyContent getSwipeyContent() {
            return this.swipeyContent;
        }

        public final boolean isRebrand() {
            return this.isRebrand;
        }

        public RegionLoadingCompleted(boolean z, boolean z2, SwipeyContent swipeyContent, boolean z3) {
            super(null);
            this.isGb = z;
            this.hideSwipey = z2;
            this.swipeyContent = swipeyContent;
            this.isRebrand = z3;
        }
    }
}
