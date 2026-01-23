package com.robinhood.android.onboarding.p205ui.usercreation.loading;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: UserCreationLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/loading/UserCreationLoadingEvent;", "", "<init>", "()V", "UserCreationStartsWithRegion", "UserCreationStartsWithEmail", "Lcom/robinhood/android/onboarding/ui/usercreation/loading/UserCreationLoadingEvent$UserCreationStartsWithEmail;", "Lcom/robinhood/android/onboarding/ui/usercreation/loading/UserCreationLoadingEvent$UserCreationStartsWithRegion;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.loading.UserCreationLoadingEvent, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class UserCreationLoadingDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ UserCreationLoadingDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UserCreationLoadingDuxo2() {
    }

    /* compiled from: UserCreationLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/loading/UserCreationLoadingEvent$UserCreationStartsWithRegion;", "Lcom/robinhood/android/onboarding/ui/usercreation/loading/UserCreationLoadingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.loading.UserCreationLoadingEvent$UserCreationStartsWithRegion */
    public static final /* data */ class UserCreationStartsWithRegion extends UserCreationLoadingDuxo2 {
        public static final int $stable = 0;
        public static final UserCreationStartsWithRegion INSTANCE = new UserCreationStartsWithRegion();

        public boolean equals(Object other) {
            return this == other || (other instanceof UserCreationStartsWithRegion);
        }

        public int hashCode() {
            return -688246304;
        }

        public String toString() {
            return "UserCreationStartsWithRegion";
        }

        private UserCreationStartsWithRegion() {
            super(null);
        }
    }

    /* compiled from: UserCreationLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/loading/UserCreationLoadingEvent$UserCreationStartsWithEmail;", "Lcom/robinhood/android/onboarding/ui/usercreation/loading/UserCreationLoadingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.loading.UserCreationLoadingEvent$UserCreationStartsWithEmail */
    public static final /* data */ class UserCreationStartsWithEmail extends UserCreationLoadingDuxo2 {
        public static final int $stable = 0;
        public static final UserCreationStartsWithEmail INSTANCE = new UserCreationStartsWithEmail();

        public boolean equals(Object other) {
            return this == other || (other instanceof UserCreationStartsWithEmail);
        }

        public int hashCode() {
            return -865258704;
        }

        public String toString() {
            return "UserCreationStartsWithEmail";
        }

        private UserCreationStartsWithEmail() {
            super(null);
        }
    }
}
