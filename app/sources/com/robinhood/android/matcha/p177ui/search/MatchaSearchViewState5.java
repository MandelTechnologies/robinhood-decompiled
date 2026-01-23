package com.robinhood.android.matcha.p177ui.search;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: MatchaSearchViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/RowCheckboxState;", "", "<init>", "()V", "Invisible", "Visible", "Lcom/robinhood/android/matcha/ui/search/RowCheckboxState$Invisible;", "Lcom/robinhood/android/matcha/ui/search/RowCheckboxState$Visible;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.search.RowCheckboxState, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class MatchaSearchViewState5 {
    public static final int $stable = 0;

    public /* synthetic */ MatchaSearchViewState5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MatchaSearchViewState5() {
    }

    /* compiled from: MatchaSearchViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/RowCheckboxState$Invisible;", "Lcom/robinhood/android/matcha/ui/search/RowCheckboxState;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.search.RowCheckboxState$Invisible */
    public static final class Invisible extends MatchaSearchViewState5 {
        public static final int $stable = 0;
        public static final Invisible INSTANCE = new Invisible();

        private Invisible() {
            super(null);
        }
    }

    /* compiled from: MatchaSearchViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/RowCheckboxState$Visible;", "Lcom/robinhood/android/matcha/ui/search/RowCheckboxState;", "checked", "", "<init>", "(Z)V", "getChecked", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.search.RowCheckboxState$Visible, reason: from toString */
    public static final /* data */ class Visible extends MatchaSearchViewState5 {
        public static final int $stable = 0;
        private final boolean checked;

        public static /* synthetic */ Visible copy$default(Visible visible, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = visible.checked;
            }
            return visible.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getChecked() {
            return this.checked;
        }

        public final Visible copy(boolean checked) {
            return new Visible(checked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Visible) && this.checked == ((Visible) other).checked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public String toString() {
            return "Visible(checked=" + this.checked + ")";
        }

        public Visible(boolean z) {
            super(null);
            this.checked = z;
        }

        public final boolean getChecked() {
            return this.checked;
        }
    }
}
