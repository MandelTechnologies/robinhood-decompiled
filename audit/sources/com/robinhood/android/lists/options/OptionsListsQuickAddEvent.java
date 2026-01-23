package com.robinhood.android.lists.options;

import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.Security;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsListsQuickAddEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent;", "", "Uploading", "Uploaded", "Error", "HideSnackbar", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Error;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$HideSnackbar;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploaded;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploading;", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface OptionsListsQuickAddEvent {

    /* compiled from: OptionsListsQuickAddEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploading;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent;", "QuickAdd", "Remove", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploading$QuickAdd;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploading$Remove;", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Uploading extends OptionsListsQuickAddEvent {

        /* compiled from: OptionsListsQuickAddEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploading$QuickAdd;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploading;", "security", "Lcom/robinhood/models/db/Security;", "<init>", "(Lcom/robinhood/models/db/Security;)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuickAdd implements Uploading {
            private final Security security;

            public static /* synthetic */ QuickAdd copy$default(QuickAdd quickAdd, Security security, int i, Object obj) {
                if ((i & 1) != 0) {
                    security = quickAdd.security;
                }
                return quickAdd.copy(security);
            }

            /* renamed from: component1, reason: from getter */
            public final Security getSecurity() {
                return this.security;
            }

            public final QuickAdd copy(Security security) {
                Intrinsics.checkNotNullParameter(security, "security");
                return new QuickAdd(security);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof QuickAdd) && Intrinsics.areEqual(this.security, ((QuickAdd) other).security);
            }

            public int hashCode() {
                return this.security.hashCode();
            }

            public String toString() {
                return "QuickAdd(security=" + this.security + ")";
            }

            public QuickAdd(Security security) {
                Intrinsics.checkNotNullParameter(security, "security");
                this.security = security;
            }

            public final Security getSecurity() {
                return this.security;
            }
        }

        /* compiled from: OptionsListsQuickAddEvent.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploading$Remove;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploading;", "security", "Lcom/robinhood/models/db/Security;", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "<init>", "(Lcom/robinhood/models/db/Security;Lcom/robinhood/models/db/CuratedList;)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "getCuratedList", "()Lcom/robinhood/models/db/CuratedList;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Remove implements Uploading {
            private final CuratedList curatedList;
            private final Security security;

            public static /* synthetic */ Remove copy$default(Remove remove, Security security, CuratedList curatedList, int i, Object obj) {
                if ((i & 1) != 0) {
                    security = remove.security;
                }
                if ((i & 2) != 0) {
                    curatedList = remove.curatedList;
                }
                return remove.copy(security, curatedList);
            }

            /* renamed from: component1, reason: from getter */
            public final Security getSecurity() {
                return this.security;
            }

            /* renamed from: component2, reason: from getter */
            public final CuratedList getCuratedList() {
                return this.curatedList;
            }

            public final Remove copy(Security security, CuratedList curatedList) {
                Intrinsics.checkNotNullParameter(security, "security");
                Intrinsics.checkNotNullParameter(curatedList, "curatedList");
                return new Remove(security, curatedList);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Remove)) {
                    return false;
                }
                Remove remove = (Remove) other;
                return Intrinsics.areEqual(this.security, remove.security) && Intrinsics.areEqual(this.curatedList, remove.curatedList);
            }

            public int hashCode() {
                return (this.security.hashCode() * 31) + this.curatedList.hashCode();
            }

            public String toString() {
                return "Remove(security=" + this.security + ", curatedList=" + this.curatedList + ")";
            }

            public Remove(Security security, CuratedList curatedList) {
                Intrinsics.checkNotNullParameter(security, "security");
                Intrinsics.checkNotNullParameter(curatedList, "curatedList");
                this.security = security;
                this.curatedList = curatedList;
            }

            public final Security getSecurity() {
                return this.security;
            }

            public final CuratedList getCuratedList() {
                return this.curatedList;
            }
        }
    }

    /* compiled from: OptionsListsQuickAddEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploaded;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent;", "QuickAdd", "Remove", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploaded$QuickAdd;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploaded$Remove;", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Uploaded extends OptionsListsQuickAddEvent {

        /* compiled from: OptionsListsQuickAddEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploaded$QuickAdd;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploaded;", "security", "Lcom/robinhood/models/db/Security;", "<init>", "(Lcom/robinhood/models/db/Security;)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuickAdd implements Uploaded {
            private final Security security;

            public static /* synthetic */ QuickAdd copy$default(QuickAdd quickAdd, Security security, int i, Object obj) {
                if ((i & 1) != 0) {
                    security = quickAdd.security;
                }
                return quickAdd.copy(security);
            }

            /* renamed from: component1, reason: from getter */
            public final Security getSecurity() {
                return this.security;
            }

            public final QuickAdd copy(Security security) {
                Intrinsics.checkNotNullParameter(security, "security");
                return new QuickAdd(security);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof QuickAdd) && Intrinsics.areEqual(this.security, ((QuickAdd) other).security);
            }

            public int hashCode() {
                return this.security.hashCode();
            }

            public String toString() {
                return "QuickAdd(security=" + this.security + ")";
            }

            public QuickAdd(Security security) {
                Intrinsics.checkNotNullParameter(security, "security");
                this.security = security;
            }

            public final Security getSecurity() {
                return this.security;
            }
        }

        /* compiled from: OptionsListsQuickAddEvent.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploaded$Remove;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Uploaded;", "security", "Lcom/robinhood/models/db/Security;", "<init>", "(Lcom/robinhood/models/db/Security;)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Remove implements Uploaded {
            private final Security security;

            public static /* synthetic */ Remove copy$default(Remove remove, Security security, int i, Object obj) {
                if ((i & 1) != 0) {
                    security = remove.security;
                }
                return remove.copy(security);
            }

            /* renamed from: component1, reason: from getter */
            public final Security getSecurity() {
                return this.security;
            }

            public final Remove copy(Security security) {
                Intrinsics.checkNotNullParameter(security, "security");
                return new Remove(security);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Remove) && Intrinsics.areEqual(this.security, ((Remove) other).security);
            }

            public int hashCode() {
                return this.security.hashCode();
            }

            public String toString() {
                return "Remove(security=" + this.security + ")";
            }

            public Remove(Security security) {
                Intrinsics.checkNotNullParameter(security, "security");
                this.security = security;
            }

            public final Security getSecurity() {
                return this.security;
            }
        }
    }

    /* compiled from: OptionsListsQuickAddEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$Error;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements OptionsListsQuickAddEvent {
        private final Throwable throwable;

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            Throwable th = this.throwable;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable th) {
            this.throwable = th;
        }

        public /* synthetic */ Error(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: OptionsListsQuickAddEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent$HideSnackbar;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HideSnackbar implements OptionsListsQuickAddEvent {
        public static final HideSnackbar INSTANCE = new HideSnackbar();

        public boolean equals(Object other) {
            return this == other || (other instanceof HideSnackbar);
        }

        public int hashCode() {
            return -1912525277;
        }

        public String toString() {
            return "HideSnackbar";
        }

        private HideSnackbar() {
        }
    }
}
