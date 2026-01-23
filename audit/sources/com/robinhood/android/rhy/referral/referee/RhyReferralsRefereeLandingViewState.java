package com.robinhood.android.rhy.referral.referee;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.models.rhy.referral.p345db.RefereeLanding;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyReferralsRefereeLandingViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState;", "", "Loading", "Error", "Loaded", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Error;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Loaded;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Loading;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RhyReferralsRefereeLandingViewState {

    /* compiled from: RhyReferralsRefereeLandingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Loading;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState;", "<init>", "()V", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements RhyReferralsRefereeLandingViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: RhyReferralsRefereeLandingViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Error;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements RhyReferralsRefereeLandingViewState {
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

        public Error(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: RhyReferralsRefereeLandingViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J3\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Loaded;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState;", "refereeLanding", "Lcom/robinhood/models/rhy/referral/db/RefereeLanding;", "primaryCtaType", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Loaded$CtaType;", "secondaryCtaType", "showDebugAddCardToGooglePayDialog", "", "<init>", "(Lcom/robinhood/models/rhy/referral/db/RefereeLanding;Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Loaded$CtaType;Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Loaded$CtaType;Z)V", "getRefereeLanding", "()Lcom/robinhood/models/rhy/referral/db/RefereeLanding;", "getPrimaryCtaType", "()Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Loaded$CtaType;", "getSecondaryCtaType", "getShowDebugAddCardToGooglePayDialog", "()Z", "primaryCtaText", "", "getPrimaryCtaText", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "secondaryCtaText", "getSecondaryCtaText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "CtaType", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Loaded implements RhyReferralsRefereeLandingViewState {
        public static final int $stable = 8;
        private final CtaType primaryCtaType;
        private final RefereeLanding refereeLanding;
        private final CtaType secondaryCtaType;
        private final boolean showDebugAddCardToGooglePayDialog;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, RefereeLanding refereeLanding, CtaType ctaType, CtaType ctaType2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                refereeLanding = loaded.refereeLanding;
            }
            if ((i & 2) != 0) {
                ctaType = loaded.primaryCtaType;
            }
            if ((i & 4) != 0) {
                ctaType2 = loaded.secondaryCtaType;
            }
            if ((i & 8) != 0) {
                z = loaded.showDebugAddCardToGooglePayDialog;
            }
            return loaded.copy(refereeLanding, ctaType, ctaType2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final RefereeLanding getRefereeLanding() {
            return this.refereeLanding;
        }

        /* renamed from: component2, reason: from getter */
        public final CtaType getPrimaryCtaType() {
            return this.primaryCtaType;
        }

        /* renamed from: component3, reason: from getter */
        public final CtaType getSecondaryCtaType() {
            return this.secondaryCtaType;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowDebugAddCardToGooglePayDialog() {
            return this.showDebugAddCardToGooglePayDialog;
        }

        public final Loaded copy(RefereeLanding refereeLanding, CtaType primaryCtaType, CtaType secondaryCtaType, boolean showDebugAddCardToGooglePayDialog) {
            Intrinsics.checkNotNullParameter(refereeLanding, "refereeLanding");
            Intrinsics.checkNotNullParameter(primaryCtaType, "primaryCtaType");
            return new Loaded(refereeLanding, primaryCtaType, secondaryCtaType, showDebugAddCardToGooglePayDialog);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.refereeLanding, loaded.refereeLanding) && this.primaryCtaType == loaded.primaryCtaType && this.secondaryCtaType == loaded.secondaryCtaType && this.showDebugAddCardToGooglePayDialog == loaded.showDebugAddCardToGooglePayDialog;
        }

        public int hashCode() {
            int iHashCode = ((this.refereeLanding.hashCode() * 31) + this.primaryCtaType.hashCode()) * 31;
            CtaType ctaType = this.secondaryCtaType;
            return ((iHashCode + (ctaType == null ? 0 : ctaType.hashCode())) * 31) + Boolean.hashCode(this.showDebugAddCardToGooglePayDialog);
        }

        public String toString() {
            return "Loaded(refereeLanding=" + this.refereeLanding + ", primaryCtaType=" + this.primaryCtaType + ", secondaryCtaType=" + this.secondaryCtaType + ", showDebugAddCardToGooglePayDialog=" + this.showDebugAddCardToGooglePayDialog + ")";
        }

        public Loaded(RefereeLanding refereeLanding, CtaType primaryCtaType, CtaType ctaType, boolean z) {
            Intrinsics.checkNotNullParameter(refereeLanding, "refereeLanding");
            Intrinsics.checkNotNullParameter(primaryCtaType, "primaryCtaType");
            this.refereeLanding = refereeLanding;
            this.primaryCtaType = primaryCtaType;
            this.secondaryCtaType = ctaType;
            this.showDebugAddCardToGooglePayDialog = z;
        }

        public final RefereeLanding getRefereeLanding() {
            return this.refereeLanding;
        }

        public final CtaType getPrimaryCtaType() {
            return this.primaryCtaType;
        }

        public final CtaType getSecondaryCtaType() {
            return this.secondaryCtaType;
        }

        public final boolean getShowDebugAddCardToGooglePayDialog() {
            return this.showDebugAddCardToGooglePayDialog;
        }

        @JvmName
        public final String getPrimaryCtaText(Composer composer, int i) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-561482961, i, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingViewState.Loaded.<get-primaryCtaText> (RhyReferralsRefereeLandingViewState.kt:25)");
            }
            String strStringResource = StringResources_androidKt.stringResource(this.primaryCtaType.getStringRes(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return strStringResource;
        }

        @JvmName
        public final String getSecondaryCtaText(Composer composer, int i) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(587640971, i, -1, "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingViewState.Loaded.<get-secondaryCtaText> (RhyReferralsRefereeLandingViewState.kt:30)");
            }
            CtaType ctaType = this.secondaryCtaType;
            String strStringResource = ctaType == null ? null : StringResources_androidKt.stringResource(ctaType.getStringRes(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return strStringResource;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RhyReferralsRefereeLandingViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Loaded$CtaType;", "", "stringRes", "", "<init>", "(Ljava/lang/String;II)V", "getStringRes", "()I", "FUND_MY_ACCOUNT", "ADD_TO_GOOGLE_PAY", "VIEW_CARD_NUMBER", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class CtaType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CtaType[] $VALUES;
            private final int stringRes;
            public static final CtaType FUND_MY_ACCOUNT = new CtaType("FUND_MY_ACCOUNT", 0, C27406R.string.rhy_referee_landing_fund);
            public static final CtaType ADD_TO_GOOGLE_PAY = new CtaType("ADD_TO_GOOGLE_PAY", 1, C27406R.string.rhy_referee_landing_add_to_wallet);
            public static final CtaType VIEW_CARD_NUMBER = new CtaType("VIEW_CARD_NUMBER", 2, C27406R.string.rhy_referee_landing_view_virtual);

            private static final /* synthetic */ CtaType[] $values() {
                return new CtaType[]{FUND_MY_ACCOUNT, ADD_TO_GOOGLE_PAY, VIEW_CARD_NUMBER};
            }

            public static EnumEntries<CtaType> getEntries() {
                return $ENTRIES;
            }

            private CtaType(String str, int i, int i2) {
                this.stringRes = i2;
            }

            public final int getStringRes() {
                return this.stringRes;
            }

            static {
                CtaType[] ctaTypeArr$values = $values();
                $VALUES = ctaTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(ctaTypeArr$values);
            }

            public static CtaType valueOf(String str) {
                return (CtaType) Enum.valueOf(CtaType.class, str);
            }

            public static CtaType[] values() {
                return (CtaType[]) $VALUES.clone();
            }
        }
    }
}
