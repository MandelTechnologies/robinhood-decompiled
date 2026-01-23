package com.robinhood.android.options.portfolioriskanalyzer;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerNavDestinations.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerSearchDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "<init>", "()V", "KEY_POSITION_ROW_SELECTION", "", "getKEY_POSITION_ROW_SELECTION$annotations", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerSearchDest, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerNavDestinations2 extends ComposableDestination {
    public static final String KEY_POSITION_ROW_SELECTION = "key_position_row_selection";
    public static final OptionsPortfolioRiskAnalyzerNavDestinations2 INSTANCE = new OptionsPortfolioRiskAnalyzerNavDestinations2();
    public static final int $stable = ComposableDestination.$stable;
    public static final Parcelable.Creator<OptionsPortfolioRiskAnalyzerNavDestinations2> CREATOR = new Creator();

    /* compiled from: OptionsPortfolioRiskAnalyzerNavDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerSearchDest$Creator */
    public static final class Creator implements Parcelable.Creator<OptionsPortfolioRiskAnalyzerNavDestinations2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsPortfolioRiskAnalyzerNavDestinations2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return OptionsPortfolioRiskAnalyzerNavDestinations2.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsPortfolioRiskAnalyzerNavDestinations2[] newArray(int i) {
            return new OptionsPortfolioRiskAnalyzerNavDestinations2[i];
        }
    }

    public static /* synthetic */ void getKEY_POSITION_ROW_SELECTION$annotations() {
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestination, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private OptionsPortfolioRiskAnalyzerNavDestinations2() {
        super("pra_search_page", null, null, 6, null);
    }
}
