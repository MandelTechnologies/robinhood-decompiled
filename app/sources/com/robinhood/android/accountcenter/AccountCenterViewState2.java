package com.robinhood.android.accountcenter;

import com.robinhood.android.models.accountcenter.api.ApiAccountCenterPage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterPage;", "", "<init>", "()V", "Loading", "Error", "Loaded", "Lcom/robinhood/android/accountcenter/AccountCenterPage$Error;", "Lcom/robinhood/android/accountcenter/AccountCenterPage$Loaded;", "Lcom/robinhood/android/accountcenter/AccountCenterPage$Loading;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.AccountCenterPage, reason: use source file name */
/* loaded from: classes24.dex */
public abstract class AccountCenterViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ AccountCenterViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AccountCenterViewState2() {
    }

    /* compiled from: AccountCenterViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterPage$Loading;", "Lcom/robinhood/android/accountcenter/AccountCenterPage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.AccountCenterPage$Loading */
    public static final /* data */ class Loading extends AccountCenterViewState2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1424216479;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: AccountCenterViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterPage$Error;", "Lcom/robinhood/android/accountcenter/AccountCenterPage;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.AccountCenterPage$Error */
    public static final class Error extends AccountCenterViewState2 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }

    /* compiled from: AccountCenterViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/AccountCenterPage$Loaded;", "Lcom/robinhood/android/accountcenter/AccountCenterPage;", "apiAccountCenterPage", "Lcom/robinhood/android/models/accountcenter/api/ApiAccountCenterPage;", "<init>", "(Lcom/robinhood/android/models/accountcenter/api/ApiAccountCenterPage;)V", "getApiAccountCenterPage", "()Lcom/robinhood/android/models/accountcenter/api/ApiAccountCenterPage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.AccountCenterPage$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends AccountCenterViewState2 {
        public static final int $stable = 8;
        private final ApiAccountCenterPage apiAccountCenterPage;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiAccountCenterPage apiAccountCenterPage, int i, Object obj) {
            if ((i & 1) != 0) {
                apiAccountCenterPage = loaded.apiAccountCenterPage;
            }
            return loaded.copy(apiAccountCenterPage);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiAccountCenterPage getApiAccountCenterPage() {
            return this.apiAccountCenterPage;
        }

        public final Loaded copy(ApiAccountCenterPage apiAccountCenterPage) {
            Intrinsics.checkNotNullParameter(apiAccountCenterPage, "apiAccountCenterPage");
            return new Loaded(apiAccountCenterPage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.apiAccountCenterPage, ((Loaded) other).apiAccountCenterPage);
        }

        public int hashCode() {
            return this.apiAccountCenterPage.hashCode();
        }

        public String toString() {
            return "Loaded(apiAccountCenterPage=" + this.apiAccountCenterPage + ")";
        }

        public final ApiAccountCenterPage getApiAccountCenterPage() {
            return this.apiAccountCenterPage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(ApiAccountCenterPage apiAccountCenterPage) {
            super(null);
            Intrinsics.checkNotNullParameter(apiAccountCenterPage, "apiAccountCenterPage");
            this.apiAccountCenterPage = apiAccountCenterPage;
        }
    }
}
