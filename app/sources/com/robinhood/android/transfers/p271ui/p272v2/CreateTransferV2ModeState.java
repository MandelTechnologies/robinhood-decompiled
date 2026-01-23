package com.robinhood.android.transfers.p271ui.p272v2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CreateTransferV2ModeState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ModeState;", "", "<init>", "()V", "isNumpadVisible", "", "()Z", "Edit", "Review", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ModeState$Edit;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ModeState$Review;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class CreateTransferV2ModeState {
    public static final int $stable = 0;

    public /* synthetic */ CreateTransferV2ModeState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean isNumpadVisible();

    private CreateTransferV2ModeState() {
    }

    /* compiled from: CreateTransferV2ModeState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ModeState$Edit;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ModeState;", "<init>", "()V", "isNumpadVisible", "", "()Z", "equals", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Edit extends CreateTransferV2ModeState {
        public static final int $stable = 0;
        public static final Edit INSTANCE = new Edit();
        private static final boolean isNumpadVisible = true;

        public boolean equals(Object other) {
            return this == other || (other instanceof Edit);
        }

        public int hashCode() {
            return -1309137217;
        }

        public String toString() {
            return "Edit";
        }

        private Edit() {
            super(null);
        }

        @Override // com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2ModeState
        public boolean isNumpadVisible() {
            return isNumpadVisible;
        }
    }

    /* compiled from: CreateTransferV2ModeState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ModeState$Review;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ModeState;", "<init>", "()V", "isNumpadVisible", "", "()Z", "equals", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Review extends CreateTransferV2ModeState {
        public static final int $stable = 0;
        public static final Review INSTANCE = new Review();
        private static final boolean isNumpadVisible = false;

        public boolean equals(Object other) {
            return this == other || (other instanceof Review);
        }

        public int hashCode() {
            return 718034637;
        }

        public String toString() {
            return "Review";
        }

        private Review() {
            super(null);
        }

        @Override // com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2ModeState
        public boolean isNumpadVisible() {
            return isNumpadVisible;
        }
    }
}
