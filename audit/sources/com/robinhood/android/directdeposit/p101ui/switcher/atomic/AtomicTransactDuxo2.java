package com.robinhood.android.directdeposit.p101ui.switcher.atomic;

import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AtomicTransactDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactViewState;", "", "canGoBack", "", "<init>", "(Z)V", "getCanGoBack", "()Z", "Loading", "Loaded", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactViewState$Loaded;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactViewState$Loading;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactViewState, reason: use source file name */
/* loaded from: classes27.dex */
public abstract class AtomicTransactDuxo2 {
    public static final int $stable = 0;
    private final boolean canGoBack;

    public /* synthetic */ AtomicTransactDuxo2(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private AtomicTransactDuxo2(boolean z) {
        this.canGoBack = z;
    }

    public final boolean getCanGoBack() {
        return this.canGoBack;
    }

    /* compiled from: AtomicTransactDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR%\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactViewState$Loading;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactViewState;", "transactUrlResult", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/utils/Either;", "", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getTransactUrlResult", "()Lcom/robinhood/udf/UiEvent;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactViewState$Loading */
    public static final class Loading extends AtomicTransactDuxo2 {
        public static final int $stable = 8;
        private final UiEvent<Either<Throwable, String>> transactUrlResult;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Loading(UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uiEvent);
        }

        public final UiEvent<Either<Throwable, String>> getTransactUrlResult() {
            return this.transactUrlResult;
        }

        public Loading(UiEvent<Either<Throwable, String>> uiEvent) {
            super(false, null);
            this.transactUrlResult = uiEvent;
        }
    }

    /* compiled from: AtomicTransactDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactViewState$Loaded;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactViewState;", "transactEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent;", "currentScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getTransactEvent", "()Lcom/robinhood/udf/UiEvent;", "getCurrentScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends AtomicTransactDuxo2 {
        public static final int $stable = 8;
        private final Screen currentScreen;
        private final UiEvent<TransactEvent> transactEvent;

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, UiEvent uiEvent, Screen screen, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = loaded.transactEvent;
            }
            if ((i & 2) != 0) {
                screen = loaded.currentScreen;
            }
            return loaded.copy(uiEvent, screen);
        }

        public final UiEvent<TransactEvent> component1() {
            return this.transactEvent;
        }

        /* renamed from: component2, reason: from getter */
        public final Screen getCurrentScreen() {
            return this.currentScreen;
        }

        public final Loaded copy(UiEvent<TransactEvent> transactEvent, Screen currentScreen) {
            return new Loaded(transactEvent, currentScreen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.transactEvent, loaded.transactEvent) && Intrinsics.areEqual(this.currentScreen, loaded.currentScreen);
        }

        public int hashCode() {
            UiEvent<TransactEvent> uiEvent = this.transactEvent;
            int iHashCode = (uiEvent == null ? 0 : uiEvent.hashCode()) * 31;
            Screen screen = this.currentScreen;
            return iHashCode + (screen != null ? screen.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(transactEvent=" + this.transactEvent + ", currentScreen=" + this.currentScreen + ")";
        }

        public /* synthetic */ Loaded(UiEvent uiEvent, Screen screen, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uiEvent, (i & 2) != 0 ? null : screen);
        }

        public final UiEvent<TransactEvent> getTransactEvent() {
            return this.transactEvent;
        }

        public final Screen getCurrentScreen() {
            return this.currentScreen;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Loaded(UiEvent<TransactEvent> uiEvent, Screen screen) {
            boolean z = false;
            if (screen != null && screen.getName() != Screen.Name.DD_SWITCHER_SEARCH_COMPANY) {
                z = true;
            }
            super(z, null);
            this.transactEvent = uiEvent;
            this.currentScreen = screen;
        }
    }
}
