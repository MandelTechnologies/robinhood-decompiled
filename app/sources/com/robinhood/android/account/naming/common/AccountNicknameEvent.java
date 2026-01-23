package com.robinhood.android.account.naming.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNicknameEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/naming/common/AccountNicknameEvent;", "", "OnSaveSuccess", "CreateSuccess", "Lcom/robinhood/android/account/naming/common/AccountNicknameEvent$CreateSuccess;", "Lcom/robinhood/android/account/naming/common/AccountNicknameEvent$OnSaveSuccess;", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AccountNicknameEvent {

    /* compiled from: AccountNicknameEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/account/naming/common/AccountNicknameEvent$OnSaveSuccess;", "Lcom/robinhood/android/account/naming/common/AccountNicknameEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OnSaveSuccess implements AccountNicknameEvent {
        public static final int $stable = 0;
        public static final OnSaveSuccess INSTANCE = new OnSaveSuccess();

        public boolean equals(Object other) {
            return this == other || (other instanceof OnSaveSuccess);
        }

        public int hashCode() {
            return 882601290;
        }

        public String toString() {
            return "OnSaveSuccess";
        }

        private OnSaveSuccess() {
        }
    }

    /* compiled from: AccountNicknameEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/account/naming/common/AccountNicknameEvent$CreateSuccess;", "Lcom/robinhood/android/account/naming/common/AccountNicknameEvent;", "applicationId", "", "<init>", "(Ljava/lang/String;)V", "getApplicationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CreateSuccess implements AccountNicknameEvent {
        public static final int $stable = 0;
        private final String applicationId;

        public static /* synthetic */ CreateSuccess copy$default(CreateSuccess createSuccess, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = createSuccess.applicationId;
            }
            return createSuccess.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        public final CreateSuccess copy(String applicationId) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            return new CreateSuccess(applicationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateSuccess) && Intrinsics.areEqual(this.applicationId, ((CreateSuccess) other).applicationId);
        }

        public int hashCode() {
            return this.applicationId.hashCode();
        }

        public String toString() {
            return "CreateSuccess(applicationId=" + this.applicationId + ")";
        }

        public CreateSuccess(String applicationId) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            this.applicationId = applicationId;
        }

        public final String getApplicationId() {
            return this.applicationId;
        }
    }
}
