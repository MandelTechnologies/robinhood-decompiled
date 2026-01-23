package com.robinhood.android.onboarding.p205ui.usercreation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationPasswordViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState;", "", "<init>", "()V", "Acceptable", "TooShort", "OtherError", "Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState$Acceptable;", "Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState$OtherError;", "Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState$TooShort;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.ValidationState, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class UserCreationPasswordViewState4 {
    public static final int $stable = 0;

    public /* synthetic */ UserCreationPasswordViewState4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: UserCreationPasswordViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState$Acceptable;", "Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.ValidationState$Acceptable */
    public static final /* data */ class Acceptable extends UserCreationPasswordViewState4 {
        public static final int $stable = 0;
        public static final Acceptable INSTANCE = new Acceptable();

        public boolean equals(Object other) {
            return this == other || (other instanceof Acceptable);
        }

        public int hashCode() {
            return 372330497;
        }

        public String toString() {
            return "Acceptable";
        }

        private Acceptable() {
            super(null);
        }
    }

    private UserCreationPasswordViewState4() {
    }

    /* compiled from: UserCreationPasswordViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState$TooShort;", "Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.ValidationState$TooShort */
    public static final /* data */ class TooShort extends UserCreationPasswordViewState4 {
        public static final int $stable = 0;
        public static final TooShort INSTANCE = new TooShort();

        public boolean equals(Object other) {
            return this == other || (other instanceof TooShort);
        }

        public int hashCode() {
            return -450220825;
        }

        public String toString() {
            return "TooShort";
        }

        private TooShort() {
            super(null);
        }
    }

    /* compiled from: UserCreationPasswordViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState$OtherError;", "Lcom/robinhood/android/onboarding/ui/usercreation/ValidationState;", "err", "", "<init>", "(Ljava/lang/String;)V", "getErr", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.ValidationState$OtherError, reason: from toString */
    public static final /* data */ class OtherError extends UserCreationPasswordViewState4 {
        public static final int $stable = 0;
        private final String err;

        public static /* synthetic */ OtherError copy$default(OtherError otherError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = otherError.err;
            }
            return otherError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErr() {
            return this.err;
        }

        public final OtherError copy(String err) {
            Intrinsics.checkNotNullParameter(err, "err");
            return new OtherError(err);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OtherError) && Intrinsics.areEqual(this.err, ((OtherError) other).err);
        }

        public int hashCode() {
            return this.err.hashCode();
        }

        public String toString() {
            return "OtherError(err=" + this.err + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherError(String err) {
            super(null);
            Intrinsics.checkNotNullParameter(err, "err");
            this.err = err;
        }

        public final String getErr() {
            return this.err;
        }
    }
}
