package com.robinhood.android.matcha.p177ui.history.detail.incentive;

import android.content.res.Resources;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.models.matcha.api.MatchaIncentiveType;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaIncentiveDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState;", "", "Loading", "Loaded", "Companion", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState$Loaded;", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState$Loading;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MatchaIncentiveDetailViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: MatchaIncentiveDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState$Loading;", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState;", "mock", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState$Loaded;", "<init>", "(Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState$Loaded;)V", "getMock", "()Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState$Loaded;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements MatchaIncentiveDetailViewState {
        public static final int $stable = 0;
        private final Loaded mock;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Loading copy$default(Loading loading, Loaded loaded, int i, Object obj) {
            if ((i & 1) != 0) {
                loaded = loading.mock;
            }
            return loading.copy(loaded);
        }

        /* renamed from: component1, reason: from getter */
        public final Loaded getMock() {
            return this.mock;
        }

        public final Loading copy(Loaded mock) {
            Intrinsics.checkNotNullParameter(mock, "mock");
            return new Loading(mock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.mock, ((Loading) other).mock);
        }

        public int hashCode() {
            return this.mock.hashCode();
        }

        public String toString() {
            return "Loading(mock=" + this.mock + ")";
        }

        public Loading(Loaded mock) {
            Intrinsics.checkNotNullParameter(mock, "mock");
            this.mock = mock;
        }

        public /* synthetic */ Loading(Loaded loaded, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MatchaIncentiveDetailViewState.INSTANCE.getLoadingMock$feature_p2p_externalDebug() : loaded);
        }

        public final Loaded getMock() {
            return this.mock;
        }
    }

    /* compiled from: MatchaIncentiveDetailViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003JQ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState$Loaded;", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState;", "referralType", "Lcom/robinhood/android/models/matcha/api/MatchaIncentiveType;", "referralName", "", InquiryField.DateField.TYPE, "amount", "referralNumber", "", "referralTotalPossible", "showReferralCount", "", "<init>", "(Lcom/robinhood/android/models/matcha/api/MatchaIncentiveType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "getReferralType", "()Lcom/robinhood/android/models/matcha/api/MatchaIncentiveType;", "getReferralName", "()Ljava/lang/String;", "getDate", "getAmount", "getReferralNumber", "()I", "getReferralTotalPossible", "getShowReferralCount", "()Z", "subtitle", "getSubtitle", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "referralCountValue", "getReferralCountValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements MatchaIncentiveDetailViewState {
        public static final int $stable = 0;
        private final String amount;
        private final String date;
        private final String referralName;
        private final int referralNumber;
        private final int referralTotalPossible;
        private final MatchaIncentiveType referralType;
        private final boolean showReferralCount;

        /* compiled from: MatchaIncentiveDetailViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MatchaIncentiveType.values().length];
                try {
                    iArr[MatchaIncentiveType.NEW_USER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MatchaIncentiveType.INVITED_USER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MatchaIncentiveType.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, MatchaIncentiveType matchaIncentiveType, String str, String str2, String str3, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                matchaIncentiveType = loaded.referralType;
            }
            if ((i3 & 2) != 0) {
                str = loaded.referralName;
            }
            if ((i3 & 4) != 0) {
                str2 = loaded.date;
            }
            if ((i3 & 8) != 0) {
                str3 = loaded.amount;
            }
            if ((i3 & 16) != 0) {
                i = loaded.referralNumber;
            }
            if ((i3 & 32) != 0) {
                i2 = loaded.referralTotalPossible;
            }
            if ((i3 & 64) != 0) {
                z = loaded.showReferralCount;
            }
            int i4 = i2;
            boolean z2 = z;
            int i5 = i;
            String str4 = str2;
            return loaded.copy(matchaIncentiveType, str, str4, str3, i5, i4, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final MatchaIncentiveType getReferralType() {
            return this.referralType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferralName() {
            return this.referralName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        /* renamed from: component5, reason: from getter */
        public final int getReferralNumber() {
            return this.referralNumber;
        }

        /* renamed from: component6, reason: from getter */
        public final int getReferralTotalPossible() {
            return this.referralTotalPossible;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShowReferralCount() {
            return this.showReferralCount;
        }

        public final Loaded copy(MatchaIncentiveType referralType, String referralName, String date, String amount, int referralNumber, int referralTotalPossible, boolean showReferralCount) {
            Intrinsics.checkNotNullParameter(referralType, "referralType");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(amount, "amount");
            return new Loaded(referralType, referralName, date, amount, referralNumber, referralTotalPossible, showReferralCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.referralType == loaded.referralType && Intrinsics.areEqual(this.referralName, loaded.referralName) && Intrinsics.areEqual(this.date, loaded.date) && Intrinsics.areEqual(this.amount, loaded.amount) && this.referralNumber == loaded.referralNumber && this.referralTotalPossible == loaded.referralTotalPossible && this.showReferralCount == loaded.showReferralCount;
        }

        public int hashCode() {
            int iHashCode = this.referralType.hashCode() * 31;
            String str = this.referralName;
            return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.date.hashCode()) * 31) + this.amount.hashCode()) * 31) + Integer.hashCode(this.referralNumber)) * 31) + Integer.hashCode(this.referralTotalPossible)) * 31) + Boolean.hashCode(this.showReferralCount);
        }

        public String toString() {
            return "Loaded(referralType=" + this.referralType + ", referralName=" + this.referralName + ", date=" + this.date + ", amount=" + this.amount + ", referralNumber=" + this.referralNumber + ", referralTotalPossible=" + this.referralTotalPossible + ", showReferralCount=" + this.showReferralCount + ")";
        }

        public Loaded(MatchaIncentiveType referralType, String str, String date, String amount, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(referralType, "referralType");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.referralType = referralType;
            this.referralName = str;
            this.date = date;
            this.amount = amount;
            this.referralNumber = i;
            this.referralTotalPossible = i2;
            this.showReferralCount = z;
        }

        public final MatchaIncentiveType getReferralType() {
            return this.referralType;
        }

        public final String getReferralName() {
            return this.referralName;
        }

        public final String getDate() {
            return this.date;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final int getReferralNumber() {
            return this.referralNumber;
        }

        public final int getReferralTotalPossible() {
            return this.referralTotalPossible;
        }

        public final boolean getShowReferralCount() {
            return this.showReferralCount;
        }

        @JvmName
        public final String getSubtitle(Composer composer, int i) throws Resources.NotFoundException {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-127148361, i, -1, "com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailViewState.Loaded.<get-subtitle> (MatchaIncentiveDetailViewState.kt:25)");
            }
            String str = this.referralName;
            String strStringResource = null;
            if (str != null) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.referralType.ordinal()];
                if (i2 == 1) {
                    composer.startReplaceGroup(1278489881);
                    strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_incentive_detail_subtitle_referral_from, new Object[]{str}, composer, 0);
                    composer.endReplaceGroup();
                } else if (i2 == 2) {
                    composer.startReplaceGroup(1278494967);
                    strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_incentive_detail_subtitle_referral_of, new Object[]{str}, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    if (i2 != 3) {
                        composer.startReplaceGroup(1278487075);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(978763089);
                    composer.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return strStringResource;
        }

        @JvmName
        public final String getReferralCountValue(Composer composer, int i) throws Resources.NotFoundException {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1566073147, i, -1, "com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailViewState.Loaded.<get-referralCountValue> (MatchaIncentiveDetailViewState.kt:40)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_incentive_detail_referral_count_description, new Object[]{Integer.valueOf(this.referralNumber), Integer.valueOf(this.referralTotalPossible)}, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return strStringResource;
        }
    }

    /* compiled from: MatchaIncentiveDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState$Loaded;", "getLoadingMock$feature_p2p_externalDebug", "()Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailViewState$Loaded;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Loaded loadingMock = new Loaded(MatchaIncentiveType.INVITED_USER, "---- ---", "-------- --- ----", "-------", 1, 3, false);

        private Companion() {
        }

        public final Loaded getLoadingMock$feature_p2p_externalDebug() {
            return loadingMock;
        }
    }
}
