package com.robinhood.android.transfercelebration;

import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IraTransferCelebrationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfercelebration/IraTransferCelebrationEvent;", "", "Loaded", "Error", "Lcom/robinhood/android/transfercelebration/IraTransferCelebrationEvent$Error;", "Lcom/robinhood/android/transfercelebration/IraTransferCelebrationEvent$Loaded;", "feature-retirement-transfer-celebration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfercelebration.IraTransferCelebrationEvent, reason: use source file name */
/* loaded from: classes9.dex */
public interface IraTransferCelebrationDuxo2 {

    /* compiled from: IraTransferCelebrationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfercelebration/IraTransferCelebrationEvent$Loaded;", "Lcom/robinhood/android/transfercelebration/IraTransferCelebrationEvent;", "celebration", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$IraContributionCelebration;", "<init>", "(Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$IraContributionCelebration;)V", "getCelebration", "()Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$IraContributionCelebration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-transfer-celebration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfercelebration.IraTransferCelebrationEvent$Loaded, reason: from toString */
    public static final /* data */ class Loaded implements IraTransferCelebrationDuxo2 {
        public static final int $stable = 8;
        private final UiPostTransferPage.IraContributionCelebration celebration;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, UiPostTransferPage.IraContributionCelebration iraContributionCelebration, int i, Object obj) {
            if ((i & 1) != 0) {
                iraContributionCelebration = loaded.celebration;
            }
            return loaded.copy(iraContributionCelebration);
        }

        /* renamed from: component1, reason: from getter */
        public final UiPostTransferPage.IraContributionCelebration getCelebration() {
            return this.celebration;
        }

        public final Loaded copy(UiPostTransferPage.IraContributionCelebration celebration) {
            Intrinsics.checkNotNullParameter(celebration, "celebration");
            return new Loaded(celebration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.celebration, ((Loaded) other).celebration);
        }

        public int hashCode() {
            return this.celebration.hashCode();
        }

        public String toString() {
            return "Loaded(celebration=" + this.celebration + ")";
        }

        public Loaded(UiPostTransferPage.IraContributionCelebration celebration) {
            Intrinsics.checkNotNullParameter(celebration, "celebration");
            this.celebration = celebration;
        }

        public final UiPostTransferPage.IraContributionCelebration getCelebration() {
            return this.celebration;
        }
    }

    /* compiled from: IraTransferCelebrationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfercelebration/IraTransferCelebrationEvent$Error;", "Lcom/robinhood/android/transfercelebration/IraTransferCelebrationEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-transfer-celebration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfercelebration.IraTransferCelebrationEvent$Error, reason: from toString */
    public static final /* data */ class Error implements IraTransferCelebrationDuxo2 {
        public static final int $stable = 8;
        private final Throwable throwable;

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
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
