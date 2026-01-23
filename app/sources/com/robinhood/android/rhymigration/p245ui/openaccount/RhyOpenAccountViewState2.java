package com.robinhood.android.rhymigration.p245ui.openaccount;

import com.robinhood.models.p355ui.IacAlertSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOpenAccountViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction;", "", "<init>", "()V", "ShowIacAlertSheet", "ShowTimeoutBottomSheet", "TransitToApproved", "LoopAtApproved", "Waiting", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction$LoopAtApproved;", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction$ShowIacAlertSheet;", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction$ShowTimeoutBottomSheet;", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction$TransitToApproved;", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction$Waiting;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.openaccount.CurrentStateAction, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class RhyOpenAccountViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ RhyOpenAccountViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: RhyOpenAccountViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction$ShowIacAlertSheet;", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction;", "sheet", "Lcom/robinhood/models/ui/IacAlertSheet;", "<init>", "(Lcom/robinhood/models/ui/IacAlertSheet;)V", "getSheet", "()Lcom/robinhood/models/ui/IacAlertSheet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.openaccount.CurrentStateAction$ShowIacAlertSheet, reason: from toString */
    public static final /* data */ class ShowIacAlertSheet extends RhyOpenAccountViewState2 {
        public static final int $stable = 8;
        private final IacAlertSheet sheet;

        public static /* synthetic */ ShowIacAlertSheet copy$default(ShowIacAlertSheet showIacAlertSheet, IacAlertSheet iacAlertSheet, int i, Object obj) {
            if ((i & 1) != 0) {
                iacAlertSheet = showIacAlertSheet.sheet;
            }
            return showIacAlertSheet.copy(iacAlertSheet);
        }

        /* renamed from: component1, reason: from getter */
        public final IacAlertSheet getSheet() {
            return this.sheet;
        }

        public final ShowIacAlertSheet copy(IacAlertSheet sheet) {
            Intrinsics.checkNotNullParameter(sheet, "sheet");
            return new ShowIacAlertSheet(sheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowIacAlertSheet) && Intrinsics.areEqual(this.sheet, ((ShowIacAlertSheet) other).sheet);
        }

        public int hashCode() {
            return this.sheet.hashCode();
        }

        public String toString() {
            return "ShowIacAlertSheet(sheet=" + this.sheet + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowIacAlertSheet(IacAlertSheet sheet) {
            super(null);
            Intrinsics.checkNotNullParameter(sheet, "sheet");
            this.sheet = sheet;
        }

        public final IacAlertSheet getSheet() {
            return this.sheet;
        }
    }

    private RhyOpenAccountViewState2() {
    }

    /* compiled from: RhyOpenAccountViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction$ShowTimeoutBottomSheet;", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.openaccount.CurrentStateAction$ShowTimeoutBottomSheet */
    public static final class ShowTimeoutBottomSheet extends RhyOpenAccountViewState2 {
        public static final int $stable = 0;
        public static final ShowTimeoutBottomSheet INSTANCE = new ShowTimeoutBottomSheet();

        private ShowTimeoutBottomSheet() {
            super(null);
        }
    }

    /* compiled from: RhyOpenAccountViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction$TransitToApproved;", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.openaccount.CurrentStateAction$TransitToApproved */
    public static final class TransitToApproved extends RhyOpenAccountViewState2 {
        public static final int $stable = 0;
        public static final TransitToApproved INSTANCE = new TransitToApproved();

        private TransitToApproved() {
            super(null);
        }
    }

    /* compiled from: RhyOpenAccountViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction$LoopAtApproved;", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.openaccount.CurrentStateAction$LoopAtApproved */
    public static final class LoopAtApproved extends RhyOpenAccountViewState2 {
        public static final int $stable = 0;
        public static final LoopAtApproved INSTANCE = new LoopAtApproved();

        private LoopAtApproved() {
            super(null);
        }
    }

    /* compiled from: RhyOpenAccountViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction$Waiting;", "Lcom/robinhood/android/rhymigration/ui/openaccount/CurrentStateAction;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.openaccount.CurrentStateAction$Waiting */
    public static final class Waiting extends RhyOpenAccountViewState2 {
        public static final int $stable = 0;
        public static final Waiting INSTANCE = new Waiting();

        private Waiting() {
            super(null);
        }
    }
}
