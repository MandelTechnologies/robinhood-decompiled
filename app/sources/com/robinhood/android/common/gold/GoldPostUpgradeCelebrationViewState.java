package com.robinhood.android.common.gold;

import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.DismissAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldPostUpgradeCelebrationViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Companion", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState$Error;", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState$Loaded;", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState$Loading;", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class GoldPostUpgradeCelebrationViewState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Loaded loadingMock = new Loaded(new UiPostTransferPage.PostTransferGoldCelebration("------ --------- -- --- ------- --- ---- -------", "", "---- ------ ----- -- --- ----------- ----- ------- ---- ----- --- --- --- --- -------- -- ---- ---------- --------", null, "------- ---- -----", new GenericAction.Deeplink(new DeeplinkAction("")), "----", new GenericAction.Dismiss(new DismissAction(false)), null, Boolean.TRUE));

    public /* synthetic */ GoldPostUpgradeCelebrationViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GoldPostUpgradeCelebrationViewState() {
    }

    /* compiled from: GoldPostUpgradeCelebrationViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState$Loading;", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends GoldPostUpgradeCelebrationViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1857115501;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: GoldPostUpgradeCelebrationViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState$Loaded;", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState;", "goldCelebration", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$PostTransferGoldCelebration;", "<init>", "(Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$PostTransferGoldCelebration;)V", "getGoldCelebration", "()Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$PostTransferGoldCelebration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends GoldPostUpgradeCelebrationViewState {
        public static final int $stable = 8;
        private final UiPostTransferPage.PostTransferGoldCelebration goldCelebration;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, UiPostTransferPage.PostTransferGoldCelebration postTransferGoldCelebration, int i, Object obj) {
            if ((i & 1) != 0) {
                postTransferGoldCelebration = loaded.goldCelebration;
            }
            return loaded.copy(postTransferGoldCelebration);
        }

        /* renamed from: component1, reason: from getter */
        public final UiPostTransferPage.PostTransferGoldCelebration getGoldCelebration() {
            return this.goldCelebration;
        }

        public final Loaded copy(UiPostTransferPage.PostTransferGoldCelebration goldCelebration) {
            Intrinsics.checkNotNullParameter(goldCelebration, "goldCelebration");
            return new Loaded(goldCelebration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.goldCelebration, ((Loaded) other).goldCelebration);
        }

        public int hashCode() {
            return this.goldCelebration.hashCode();
        }

        public String toString() {
            return "Loaded(goldCelebration=" + this.goldCelebration + ")";
        }

        public final UiPostTransferPage.PostTransferGoldCelebration getGoldCelebration() {
            return this.goldCelebration;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(UiPostTransferPage.PostTransferGoldCelebration goldCelebration) {
            super(null);
            Intrinsics.checkNotNullParameter(goldCelebration, "goldCelebration");
            this.goldCelebration = goldCelebration;
        }
    }

    /* compiled from: GoldPostUpgradeCelebrationViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState$Error;", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends GoldPostUpgradeCelebrationViewState {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: GoldPostUpgradeCelebrationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState$Loaded;", "getLoadingMock", "()Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState$Loaded;", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Loaded getLoadingMock() {
            return GoldPostUpgradeCelebrationViewState.loadingMock;
        }
    }
}
