package com.robinhood.android.recommendations.p224ui.walkthrough;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsPortfolio;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsWalkthroughPage.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 #2\u00020\u0001:\u0004 !\"#B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007\u0082\u0001\u0002$%¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage;", "Landroid/os/Parcelable;", "<init>", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "description", "getDescription", "continueBtnTitle", "getContinueBtnTitle", "animationType", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$AnimationType;", "getAnimationType", "()Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$AnimationType;", "startFrame", "", "getStartFrame", "()I", "endFrame", "getEndFrame", "prospectusLink", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$Link;", "getProspectusLink", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$Link;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "getDisclosure", "Simple", "Asset", "AnimationType", "Companion", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$Asset;", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$Simple;", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class RecommendationsWalkthroughPage implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ RecommendationsWalkthroughPage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract AnimationType getAnimationType();

    public abstract String getContinueBtnTitle();

    public abstract String getDescription();

    public abstract String getDisclosure();

    public abstract int getEndFrame();

    public abstract Screen getLoggingScreen();

    public abstract UiRecommendationsPortfolio.Link getProspectusLink();

    public abstract int getStartFrame();

    public abstract String getTitle();

    private RecommendationsWalkthroughPage() {
    }

    /* compiled from: RecommendationsWalkthroughPage.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010+\u001a\u00020\tJ\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\tHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$Simple;", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage;", "title", "", "description", "continueBtnTitle", "animationType", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$AnimationType;", "startFrame", "", "endFrame", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$AnimationType;IILcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getContinueBtnTitle", "getAnimationType", "()Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$AnimationType;", "getStartFrame", "()I", "getEndFrame", "getLoggingScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getDisclosure", "prospectusLink", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$Link;", "getProspectusLink$annotations", "()V", "getProspectusLink", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$Link;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Simple extends RecommendationsWalkthroughPage {
        public static final Parcelable.Creator<Simple> CREATOR = new Creator();
        private final AnimationType animationType;
        private final String continueBtnTitle;
        private final String description;
        private final String disclosure;
        private final int endFrame;
        private final Screen loggingScreen;
        private final UiRecommendationsPortfolio.Link prospectusLink;
        private final int startFrame;
        private final String title;

        /* compiled from: RecommendationsWalkthroughPage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Simple> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Simple createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Simple(parcel.readString(), parcel.readString(), parcel.readString(), AnimationType.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), (Screen) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Simple[] newArray(int i) {
                return new Simple[i];
            }
        }

        public static /* synthetic */ Simple copy$default(Simple simple, String str, String str2, String str3, AnimationType animationType, int i, int i2, Screen screen, String str4, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = simple.title;
            }
            if ((i3 & 2) != 0) {
                str2 = simple.description;
            }
            if ((i3 & 4) != 0) {
                str3 = simple.continueBtnTitle;
            }
            if ((i3 & 8) != 0) {
                animationType = simple.animationType;
            }
            if ((i3 & 16) != 0) {
                i = simple.startFrame;
            }
            if ((i3 & 32) != 0) {
                i2 = simple.endFrame;
            }
            if ((i3 & 64) != 0) {
                screen = simple.loggingScreen;
            }
            if ((i3 & 128) != 0) {
                str4 = simple.disclosure;
            }
            Screen screen2 = screen;
            String str5 = str4;
            int i4 = i;
            int i5 = i2;
            return simple.copy(str, str2, str3, animationType, i4, i5, screen2, str5);
        }

        public static /* synthetic */ void getProspectusLink$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContinueBtnTitle() {
            return this.continueBtnTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final AnimationType getAnimationType() {
            return this.animationType;
        }

        /* renamed from: component5, reason: from getter */
        public final int getStartFrame() {
            return this.startFrame;
        }

        /* renamed from: component6, reason: from getter */
        public final int getEndFrame() {
            return this.endFrame;
        }

        /* renamed from: component7, reason: from getter */
        public final Screen getLoggingScreen() {
            return this.loggingScreen;
        }

        /* renamed from: component8, reason: from getter */
        public final String getDisclosure() {
            return this.disclosure;
        }

        public final Simple copy(String title, String description, String continueBtnTitle, AnimationType animationType, int startFrame, int endFrame, Screen loggingScreen, String disclosure) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(continueBtnTitle, "continueBtnTitle");
            Intrinsics.checkNotNullParameter(animationType, "animationType");
            return new Simple(title, description, continueBtnTitle, animationType, startFrame, endFrame, loggingScreen, disclosure);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Simple)) {
                return false;
            }
            Simple simple = (Simple) other;
            return Intrinsics.areEqual(this.title, simple.title) && Intrinsics.areEqual(this.description, simple.description) && Intrinsics.areEqual(this.continueBtnTitle, simple.continueBtnTitle) && this.animationType == simple.animationType && this.startFrame == simple.startFrame && this.endFrame == simple.endFrame && Intrinsics.areEqual(this.loggingScreen, simple.loggingScreen) && Intrinsics.areEqual(this.disclosure, simple.disclosure);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.continueBtnTitle.hashCode()) * 31) + this.animationType.hashCode()) * 31) + Integer.hashCode(this.startFrame)) * 31) + Integer.hashCode(this.endFrame)) * 31;
            Screen screen = this.loggingScreen;
            int iHashCode2 = (iHashCode + (screen == null ? 0 : screen.hashCode())) * 31;
            String str = this.disclosure;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Simple(title=" + this.title + ", description=" + this.description + ", continueBtnTitle=" + this.continueBtnTitle + ", animationType=" + this.animationType + ", startFrame=" + this.startFrame + ", endFrame=" + this.endFrame + ", loggingScreen=" + this.loggingScreen + ", disclosure=" + this.disclosure + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.continueBtnTitle);
            dest.writeString(this.animationType.name());
            dest.writeInt(this.startFrame);
            dest.writeInt(this.endFrame);
            dest.writeSerializable(this.loggingScreen);
            dest.writeString(this.disclosure);
        }

        public /* synthetic */ Simple(String str, String str2, String str3, AnimationType animationType, int i, int i2, Screen screen, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, animationType, i, i2, screen, (i3 & 128) != 0 ? null : str4);
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public String getDescription() {
            return this.description;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public String getContinueBtnTitle() {
            return this.continueBtnTitle;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public AnimationType getAnimationType() {
            return this.animationType;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public int getStartFrame() {
            return this.startFrame;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public int getEndFrame() {
            return this.endFrame;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public Screen getLoggingScreen() {
            return this.loggingScreen;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public String getDisclosure() {
            return this.disclosure;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Simple(String title, String description, String continueBtnTitle, AnimationType animationType, int i, int i2, Screen screen, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(continueBtnTitle, "continueBtnTitle");
            Intrinsics.checkNotNullParameter(animationType, "animationType");
            this.title = title;
            this.description = description;
            this.continueBtnTitle = continueBtnTitle;
            this.animationType = animationType;
            this.startFrame = i;
            this.endFrame = i2;
            this.loggingScreen = screen;
            this.disclosure = str;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public UiRecommendationsPortfolio.Link getProspectusLink() {
            return this.prospectusLink;
        }
    }

    /* compiled from: RecommendationsWalkthroughPage.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003Je\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0006\u00103\u001a\u00020\bJ\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\bHÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014R\u001c\u0010&\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010$\u001a\u0004\b(\u0010\u0014¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$Asset;", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage;", "title", "", "description", "animationType", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$AnimationType;", "startFrame", "", "endFrame", "prospectusLink", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$Link;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "learnMoreTitle", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$AnimationType;IILcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$Link;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;Ljava/util/UUID;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getAnimationType", "()Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$AnimationType;", "getStartFrame", "()I", "getEndFrame", "getProspectusLink", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$Link;", "getLoggingScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getLearnMoreTitle", "getInstrumentId", "()Ljava/util/UUID;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "getDisclosure$annotations", "()V", "getDisclosure", "continueBtnTitle", "getContinueBtnTitle$annotations", "getContinueBtnTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Asset extends RecommendationsWalkthroughPage {
        public static final Parcelable.Creator<Asset> CREATOR = new Creator();
        private final AnimationType animationType;
        private final String continueBtnTitle;
        private final String description;
        private final String disclosure;
        private final int endFrame;
        private final UUID instrumentId;
        private final String learnMoreTitle;
        private final Screen loggingScreen;
        private final UiRecommendationsPortfolio.Link prospectusLink;
        private final int startFrame;
        private final String title;

        /* compiled from: RecommendationsWalkthroughPage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Asset> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Asset createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Asset(parcel.readString(), parcel.readString(), AnimationType.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), (UiRecommendationsPortfolio.Link) parcel.readParcelable(Asset.class.getClassLoader()), (Screen) parcel.readSerializable(), parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Asset[] newArray(int i) {
                return new Asset[i];
            }
        }

        public static /* synthetic */ Asset copy$default(Asset asset, String str, String str2, AnimationType animationType, int i, int i2, UiRecommendationsPortfolio.Link link, Screen screen, String str3, UUID uuid, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = asset.title;
            }
            if ((i3 & 2) != 0) {
                str2 = asset.description;
            }
            if ((i3 & 4) != 0) {
                animationType = asset.animationType;
            }
            if ((i3 & 8) != 0) {
                i = asset.startFrame;
            }
            if ((i3 & 16) != 0) {
                i2 = asset.endFrame;
            }
            if ((i3 & 32) != 0) {
                link = asset.prospectusLink;
            }
            if ((i3 & 64) != 0) {
                screen = asset.loggingScreen;
            }
            if ((i3 & 128) != 0) {
                str3 = asset.learnMoreTitle;
            }
            if ((i3 & 256) != 0) {
                uuid = asset.instrumentId;
            }
            String str4 = str3;
            UUID uuid2 = uuid;
            UiRecommendationsPortfolio.Link link2 = link;
            Screen screen2 = screen;
            int i4 = i2;
            AnimationType animationType2 = animationType;
            return asset.copy(str, str2, animationType2, i, i4, link2, screen2, str4, uuid2);
        }

        public static /* synthetic */ void getContinueBtnTitle$annotations() {
        }

        public static /* synthetic */ void getDisclosure$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final AnimationType getAnimationType() {
            return this.animationType;
        }

        /* renamed from: component4, reason: from getter */
        public final int getStartFrame() {
            return this.startFrame;
        }

        /* renamed from: component5, reason: from getter */
        public final int getEndFrame() {
            return this.endFrame;
        }

        /* renamed from: component6, reason: from getter */
        public final UiRecommendationsPortfolio.Link getProspectusLink() {
            return this.prospectusLink;
        }

        /* renamed from: component7, reason: from getter */
        public final Screen getLoggingScreen() {
            return this.loggingScreen;
        }

        /* renamed from: component8, reason: from getter */
        public final String getLearnMoreTitle() {
            return this.learnMoreTitle;
        }

        /* renamed from: component9, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final Asset copy(String title, String description, AnimationType animationType, int startFrame, int endFrame, UiRecommendationsPortfolio.Link prospectusLink, Screen loggingScreen, String learnMoreTitle, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(animationType, "animationType");
            Intrinsics.checkNotNullParameter(prospectusLink, "prospectusLink");
            Intrinsics.checkNotNullParameter(learnMoreTitle, "learnMoreTitle");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Asset(title, description, animationType, startFrame, endFrame, prospectusLink, loggingScreen, learnMoreTitle, instrumentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Asset)) {
                return false;
            }
            Asset asset = (Asset) other;
            return Intrinsics.areEqual(this.title, asset.title) && Intrinsics.areEqual(this.description, asset.description) && this.animationType == asset.animationType && this.startFrame == asset.startFrame && this.endFrame == asset.endFrame && Intrinsics.areEqual(this.prospectusLink, asset.prospectusLink) && Intrinsics.areEqual(this.loggingScreen, asset.loggingScreen) && Intrinsics.areEqual(this.learnMoreTitle, asset.learnMoreTitle) && Intrinsics.areEqual(this.instrumentId, asset.instrumentId);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.animationType.hashCode()) * 31) + Integer.hashCode(this.startFrame)) * 31) + Integer.hashCode(this.endFrame)) * 31) + this.prospectusLink.hashCode()) * 31;
            Screen screen = this.loggingScreen;
            return ((((iHashCode + (screen == null ? 0 : screen.hashCode())) * 31) + this.learnMoreTitle.hashCode()) * 31) + this.instrumentId.hashCode();
        }

        public String toString() {
            return "Asset(title=" + this.title + ", description=" + this.description + ", animationType=" + this.animationType + ", startFrame=" + this.startFrame + ", endFrame=" + this.endFrame + ", prospectusLink=" + this.prospectusLink + ", loggingScreen=" + this.loggingScreen + ", learnMoreTitle=" + this.learnMoreTitle + ", instrumentId=" + this.instrumentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.animationType.name());
            dest.writeInt(this.startFrame);
            dest.writeInt(this.endFrame);
            dest.writeParcelable(this.prospectusLink, flags);
            dest.writeSerializable(this.loggingScreen);
            dest.writeString(this.learnMoreTitle);
            dest.writeSerializable(this.instrumentId);
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public String getDescription() {
            return this.description;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public AnimationType getAnimationType() {
            return this.animationType;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public int getStartFrame() {
            return this.startFrame;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public int getEndFrame() {
            return this.endFrame;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public UiRecommendationsPortfolio.Link getProspectusLink() {
            return this.prospectusLink;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public Screen getLoggingScreen() {
            return this.loggingScreen;
        }

        public final String getLearnMoreTitle() {
            return this.learnMoreTitle;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Asset(String title, String description, AnimationType animationType, int i, int i2, UiRecommendationsPortfolio.Link prospectusLink, Screen screen, String learnMoreTitle, UUID instrumentId) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(animationType, "animationType");
            Intrinsics.checkNotNullParameter(prospectusLink, "prospectusLink");
            Intrinsics.checkNotNullParameter(learnMoreTitle, "learnMoreTitle");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.title = title;
            this.description = description;
            this.animationType = animationType;
            this.startFrame = i;
            this.endFrame = i2;
            this.prospectusLink = prospectusLink;
            this.loggingScreen = screen;
            this.learnMoreTitle = learnMoreTitle;
            this.instrumentId = instrumentId;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public String getDisclosure() {
            return this.disclosure;
        }

        @Override // com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage
        public String getContinueBtnTitle() {
            return this.continueBtnTitle;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecommendationsWalkthroughPage.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$AnimationType;", "", "<init>", "(Ljava/lang/String;I)V", "LOTTIE", "PORTFOLIO_VIEW_INCOMING", "PORTFOLIO_VIEW_WEIGHTED", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AnimationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType LOTTIE = new AnimationType("LOTTIE", 0);
        public static final AnimationType PORTFOLIO_VIEW_INCOMING = new AnimationType("PORTFOLIO_VIEW_INCOMING", 1);
        public static final AnimationType PORTFOLIO_VIEW_WEIGHTED = new AnimationType("PORTFOLIO_VIEW_WEIGHTED", 2);

        private static final /* synthetic */ AnimationType[] $values() {
            return new AnimationType[]{LOTTIE, PORTFOLIO_VIEW_INCOMING, PORTFOLIO_VIEW_WEIGHTED};
        }

        public static EnumEntries<AnimationType> getEntries() {
            return $ENTRIES;
        }

        private AnimationType(String str, int i) {
        }

        static {
            AnimationType[] animationTypeArr$values = $values();
            $VALUES = animationTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(animationTypeArr$values);
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    /* compiled from: RecommendationsWalkthroughPage.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J:\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$Simple;", "page", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$SimplePage;", "animationType", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$AnimationType;", "startFrame", "", "endFrame", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage$Asset;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$AssetPage;", "instrumentId", "Ljava/util/UUID;", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Simple from$default(Companion companion, UiRecommendationsPortfolio.SimplePage simplePage, AnimationType animationType, int i, int i2, Screen screen, String str, int i3, Object obj) {
            if ((i3 & 16) != 0) {
                screen = null;
            }
            if ((i3 & 32) != 0) {
                str = null;
            }
            return companion.from(simplePage, animationType, i, i2, screen, str);
        }

        public final Simple from(UiRecommendationsPortfolio.SimplePage page, AnimationType animationType, int startFrame, int endFrame, Screen loggingScreen, String disclosure) {
            Intrinsics.checkNotNullParameter(page, "page");
            Intrinsics.checkNotNullParameter(animationType, "animationType");
            return new Simple(page.getTitle(), page.getDescription(), page.getContinueButtonTitle(), animationType, startFrame, endFrame, loggingScreen, disclosure);
        }

        public static /* synthetic */ Asset from$default(Companion companion, UiRecommendationsPortfolio.AssetPage assetPage, AnimationType animationType, int i, int i2, UUID uuid, Screen screen, int i3, Object obj) {
            if ((i3 & 32) != 0) {
                screen = null;
            }
            return companion.from(assetPage, animationType, i, i2, uuid, screen);
        }

        public final Asset from(UiRecommendationsPortfolio.AssetPage page, AnimationType animationType, int startFrame, int endFrame, UUID instrumentId, Screen loggingScreen) {
            Intrinsics.checkNotNullParameter(page, "page");
            Intrinsics.checkNotNullParameter(animationType, "animationType");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Asset(page.getTitle(), page.getDescription(), animationType, startFrame, endFrame, page.getProspectusLink(), loggingScreen, page.getLearnMoreTitle(), instrumentId);
        }
    }
}
