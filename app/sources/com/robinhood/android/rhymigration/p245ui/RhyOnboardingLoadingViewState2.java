package com.robinhood.android.rhymigration.p245ui;

import com.robinhood.android.rhymigration.model.UiRhyMigration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOnboardingLoadingViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus;", "", "<init>", "()V", "Success", "Error", "Loading", "Ineligible", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus$Error;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus$Ineligible;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus$Loading;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus$Success;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingStatus, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class RhyOnboardingLoadingViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ RhyOnboardingLoadingViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RhyOnboardingLoadingViewState2() {
    }

    /* compiled from: RhyOnboardingLoadingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus$Success;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus;", "rhyMigration", "Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "<init>", "(Lcom/robinhood/android/rhymigration/model/UiRhyMigration;)V", "getRhyMigration", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingStatus$Success */
    public static final class Success extends RhyOnboardingLoadingViewState2 {
        public static final int $stable = 8;
        private final UiRhyMigration rhyMigration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(UiRhyMigration rhyMigration) {
            super(null);
            Intrinsics.checkNotNullParameter(rhyMigration, "rhyMigration");
            this.rhyMigration = rhyMigration;
        }

        public final UiRhyMigration getRhyMigration() {
            return this.rhyMigration;
        }
    }

    /* compiled from: RhyOnboardingLoadingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus$Error;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingStatus$Error */
    public static final class Error extends RhyOnboardingLoadingViewState2 {
        public static final int $stable = 8;
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: RhyOnboardingLoadingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus$Loading;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingStatus$Loading */
    public static final class Loading extends RhyOnboardingLoadingViewState2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: RhyOnboardingLoadingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus$Ineligible;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingStatus;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingStatus$Ineligible */
    public static final class Ineligible extends RhyOnboardingLoadingViewState2 {
        public static final int $stable = 0;
        public static final Ineligible INSTANCE = new Ineligible();

        private Ineligible() {
            super(null);
        }
    }
}
