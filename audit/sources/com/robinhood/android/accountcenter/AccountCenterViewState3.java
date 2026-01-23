package com.robinhood.android.accountcenter;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus;", "", "<init>", "()V", "Removing", "Success", "Failed", "Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus$Failed;", "Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus$Removing;", "Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus$Success;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.RemoveProfilePictureStatus, reason: use source file name */
/* loaded from: classes24.dex */
public abstract class AccountCenterViewState3 {
    public static final int $stable = 0;

    public /* synthetic */ AccountCenterViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AccountCenterViewState3() {
    }

    /* compiled from: AccountCenterViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus$Removing;", "Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.RemoveProfilePictureStatus$Removing */
    public static final /* data */ class Removing extends AccountCenterViewState3 {
        public static final int $stable = 0;
        public static final Removing INSTANCE = new Removing();

        public boolean equals(Object other) {
            return this == other || (other instanceof Removing);
        }

        public int hashCode() {
            return 775323588;
        }

        public String toString() {
            return "Removing";
        }

        private Removing() {
            super(null);
        }
    }

    /* compiled from: AccountCenterViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus$Success;", "Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus;", "event", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.RemoveProfilePictureStatus$Success */
    public static final class Success extends AccountCenterViewState3 {
        public static final int $stable = 8;
        private final UiEvent<Unit> event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(UiEvent<Unit> event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public final UiEvent<Unit> getEvent() {
            return this.event;
        }
    }

    /* compiled from: AccountCenterViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus$Failed;", "Lcom/robinhood/android/accountcenter/RemoveProfilePictureStatus;", "event", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.accountcenter.RemoveProfilePictureStatus$Failed */
    public static final class Failed extends AccountCenterViewState3 {
        public static final int $stable = 8;
        private final UiEvent<Throwable> event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(UiEvent<Throwable> event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public final UiEvent<Throwable> getEvent() {
            return this.event;
        }
    }
}
