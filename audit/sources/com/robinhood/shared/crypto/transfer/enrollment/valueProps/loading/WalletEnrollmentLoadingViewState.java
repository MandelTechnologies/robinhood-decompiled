package com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletEnrollmentLoadingViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingViewState;", "", "<init>", "()V", "playSpeed", "", "getPlaySpeed", "()F", "Downloading", "Completed", "Failed", "Companion", "Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingViewState$Completed;", "Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingViewState$Downloading;", "Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingViewState$Failed;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class WalletEnrollmentLoadingViewState {
    public static final int $stable = 0;
    private static final float ANIMATION_SPEED_DEFAULT = 0.1f;
    private static final float ANIMATION_SPEED_FAILURE = 0.0f;
    private static final float ANIMATION_SPEED_NORMAL = 1.0f;

    public /* synthetic */ WalletEnrollmentLoadingViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float getPlaySpeed();

    private WalletEnrollmentLoadingViewState() {
    }

    /* compiled from: WalletEnrollmentLoadingViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingViewState$Downloading;", "Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingViewState;", "playSpeed", "", "startPlaying", "", "<init>", "(FZ)V", "getPlaySpeed", "()F", "getStartPlaying", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Downloading extends WalletEnrollmentLoadingViewState {
        public static final int $stable = 0;
        private final float playSpeed;
        private final boolean startPlaying;

        public Downloading() {
            this(WalletEnrollmentLoadingViewState.ANIMATION_SPEED_FAILURE, false, 3, null);
        }

        public static /* synthetic */ Downloading copy$default(Downloading downloading, float f, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                f = downloading.playSpeed;
            }
            if ((i & 2) != 0) {
                z = downloading.startPlaying;
            }
            return downloading.copy(f, z);
        }

        /* renamed from: component1, reason: from getter */
        public final float getPlaySpeed() {
            return this.playSpeed;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getStartPlaying() {
            return this.startPlaying;
        }

        public final Downloading copy(float playSpeed, boolean startPlaying) {
            return new Downloading(playSpeed, startPlaying);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Downloading)) {
                return false;
            }
            Downloading downloading = (Downloading) other;
            return Float.compare(this.playSpeed, downloading.playSpeed) == 0 && this.startPlaying == downloading.startPlaying;
        }

        public int hashCode() {
            return (Float.hashCode(this.playSpeed) * 31) + Boolean.hashCode(this.startPlaying);
        }

        public String toString() {
            return "Downloading(playSpeed=" + this.playSpeed + ", startPlaying=" + this.startPlaying + ")";
        }

        public /* synthetic */ Downloading(float f, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.1f : f, (i & 2) != 0 ? false : z);
        }

        @Override // com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingViewState
        public float getPlaySpeed() {
            return this.playSpeed;
        }

        public final boolean getStartPlaying() {
            return this.startPlaying;
        }

        public Downloading(float f, boolean z) {
            super(null);
            this.playSpeed = f;
            this.startPlaying = z;
        }
    }

    /* compiled from: WalletEnrollmentLoadingViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingViewState$Completed;", "Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingViewState;", "files", "", "Landroid/net/Uri;", "<init>", "(Ljava/util/List;)V", "getFiles", "()Ljava/util/List;", "playSpeed", "", "getPlaySpeed", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Completed extends WalletEnrollmentLoadingViewState {
        public static final int $stable = 8;
        private final List<Uri> files;
        private final float playSpeed;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Completed copy$default(Completed completed, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = completed.files;
            }
            return completed.copy(list);
        }

        public final List<Uri> component1() {
            return this.files;
        }

        public final Completed copy(List<? extends Uri> files) {
            Intrinsics.checkNotNullParameter(files, "files");
            return new Completed(files);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Completed) && Intrinsics.areEqual(this.files, ((Completed) other).files);
        }

        public int hashCode() {
            return this.files.hashCode();
        }

        public String toString() {
            return "Completed(files=" + this.files + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Completed(List<? extends Uri> files) {
            super(null);
            Intrinsics.checkNotNullParameter(files, "files");
            this.files = files;
            this.playSpeed = 1.0f;
        }

        public final List<Uri> getFiles() {
            return this.files;
        }

        @Override // com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingViewState
        public float getPlaySpeed() {
            return this.playSpeed;
        }
    }

    /* compiled from: WalletEnrollmentLoadingViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingViewState$Failed;", "Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "playSpeed", "", "getPlaySpeed", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failed extends WalletEnrollmentLoadingViewState {
        public static final int $stable = 8;
        private final Throwable error;
        private final float playSpeed;

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failed.error;
            }
            return failed.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Failed copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failed(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }

        @Override // com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingViewState
        public float getPlaySpeed() {
            return this.playSpeed;
        }
    }
}
