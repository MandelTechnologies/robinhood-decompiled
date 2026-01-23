package com.robinhood.android.trade.recommendations.p262ui.disclosures;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.trade.recommendations.p262ui.disclosures.RecommendationsDisclosuresFragment;
import com.robinhood.utils.p409ui.activity.ActivityCompanion3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsDisclosuresActivity.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\b\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/disclosures/RecommendationsDisclosuresActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Extras", "Companion", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecommendationsDisclosuresActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public RecommendationsDisclosuresActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            RecommendationsDisclosuresFragment.Companion companion = RecommendationsDisclosuresFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new RecommendationsDisclosuresFragment.Args(((Extras) companion2.getExtras((Activity) this)).getRecommendationId(), ((Extras) companion2.getExtras((Activity) this)).getAccountNumber())));
        }
    }

    /* compiled from: RecommendationsDisclosuresActivity.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/disclosures/RecommendationsDisclosuresActivity$Extras;", "Landroid/os/Parcelable;", "recommendationId", "Ljava/util/UUID;", "accountNumber", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getRecommendationId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Extras implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID recommendationId;

        /* compiled from: RecommendationsDisclosuresActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Extras((UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.recommendationId);
            dest.writeString(this.accountNumber);
        }

        public Extras(UUID recommendationId, String str) {
            Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
            this.recommendationId = recommendationId;
            this.accountNumber = str;
        }

        public final UUID getRecommendationId() {
            return this.recommendationId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: RecommendationsDisclosuresActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/disclosures/RecommendationsDisclosuresActivity$Companion;", "Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "Lcom/robinhood/android/trade/recommendations/ui/disclosures/RecommendationsDisclosuresActivity;", "Lcom/robinhood/android/trade/recommendations/ui/disclosures/RecommendationsDisclosuresActivity$Extras;", "<init>", "()V", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements ActivityCompanion3<RecommendationsDisclosuresActivity, Extras> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public Extras getExtras(RecommendationsDisclosuresActivity recommendationsDisclosuresActivity) {
            return (Extras) ActivityCompanion3.DefaultImpls.getExtras(this, recommendationsDisclosuresActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, Extras extras) {
            return ActivityCompanion3.DefaultImpls.getIntentWithExtras(this, context, extras);
        }
    }
}
