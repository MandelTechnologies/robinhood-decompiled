package com.robinhood.android.margin.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.models.parceler.HttpUrlParceler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: UiDayTradeInfo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020'J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001c¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/margin/model/UiDayTradeInfo;", "Landroid/os/Parcelable;", "introImageUrlLight", "Lokhttp3/HttpUrl;", "introImageUrlDark", "title", "", "description", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "steps", "", "Lcom/robinhood/android/margin/model/UiDayTradeInfoStep;", "cashManagementStep", "cashManagementInterestStep", "recommendProtectionStep", "protectionEnabledStep", "<init>", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/util/List;Lcom/robinhood/android/margin/model/UiDayTradeInfoStep;Lcom/robinhood/android/margin/model/UiDayTradeInfoStep;Lcom/robinhood/android/margin/model/UiDayTradeInfoStep;Lcom/robinhood/android/margin/model/UiDayTradeInfoStep;)V", "getIntroImageUrlLight", "()Lokhttp3/HttpUrl;", "getIntroImageUrlDark", "getTitle", "()Ljava/lang/String;", "getDescription", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getSteps", "()Ljava/util/List;", "getCashManagementStep", "()Lcom/robinhood/android/margin/model/UiDayTradeInfoStep;", "getCashManagementInterestStep", "getRecommendProtectionStep", "getProtectionEnabledStep", "imageUrlForDayNightMode", "mode", "Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "imageUrlForDayNightOverlay", "overlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UiDayTradeInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiDayTradeInfo> CREATOR = new Creator();
    private final UiDayTradeInfoStep cashManagementInterestStep;
    private final UiDayTradeInfoStep cashManagementStep;
    private final MarkdownContent description;
    private final HttpUrl introImageUrlDark;
    private final HttpUrl introImageUrlLight;
    private final UiDayTradeInfoStep protectionEnabledStep;
    private final UiDayTradeInfoStep recommendProtectionStep;
    private final List<UiDayTradeInfoStep> steps;
    private final String title;

    /* compiled from: UiDayTradeInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiDayTradeInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDayTradeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            HttpUrlParceler httpUrlParceler = HttpUrlParceler.INSTANCE;
            HttpUrl httpUrlCreate = httpUrlParceler.create(parcel);
            HttpUrl httpUrlCreate2 = httpUrlParceler.create(parcel);
            String string2 = parcel.readString();
            MarkdownContent markdownContent = (MarkdownContent) parcel.readParcelable(UiDayTradeInfo.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UiDayTradeInfoStep.CREATOR.createFromParcel(parcel));
            }
            Parcelable.Creator<UiDayTradeInfoStep> creator = UiDayTradeInfoStep.CREATOR;
            return new UiDayTradeInfo(httpUrlCreate, httpUrlCreate2, string2, markdownContent, arrayList, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDayTradeInfo[] newArray(int i) {
            return new UiDayTradeInfo[i];
        }
    }

    /* compiled from: UiDayTradeInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NightModeManager2.values().length];
            try {
                iArr[NightModeManager2.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NightModeManager2.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DayNightOverlay.values().length];
            try {
                iArr2[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        HttpUrlParceler httpUrlParceler = HttpUrlParceler.INSTANCE;
        httpUrlParceler.write(this.introImageUrlLight, dest, flags);
        httpUrlParceler.write(this.introImageUrlDark, dest, flags);
        dest.writeString(this.title);
        dest.writeParcelable(this.description, flags);
        List<UiDayTradeInfoStep> list = this.steps;
        dest.writeInt(list.size());
        Iterator<UiDayTradeInfoStep> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        this.cashManagementStep.writeToParcel(dest, flags);
        this.cashManagementInterestStep.writeToParcel(dest, flags);
        this.recommendProtectionStep.writeToParcel(dest, flags);
        this.protectionEnabledStep.writeToParcel(dest, flags);
    }

    public UiDayTradeInfo(HttpUrl introImageUrlLight, HttpUrl introImageUrlDark, String title, MarkdownContent description, List<UiDayTradeInfoStep> steps, UiDayTradeInfoStep cashManagementStep, UiDayTradeInfoStep cashManagementInterestStep, UiDayTradeInfoStep recommendProtectionStep, UiDayTradeInfoStep protectionEnabledStep) {
        Intrinsics.checkNotNullParameter(introImageUrlLight, "introImageUrlLight");
        Intrinsics.checkNotNullParameter(introImageUrlDark, "introImageUrlDark");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(cashManagementStep, "cashManagementStep");
        Intrinsics.checkNotNullParameter(cashManagementInterestStep, "cashManagementInterestStep");
        Intrinsics.checkNotNullParameter(recommendProtectionStep, "recommendProtectionStep");
        Intrinsics.checkNotNullParameter(protectionEnabledStep, "protectionEnabledStep");
        this.introImageUrlLight = introImageUrlLight;
        this.introImageUrlDark = introImageUrlDark;
        this.title = title;
        this.description = description;
        this.steps = steps;
        this.cashManagementStep = cashManagementStep;
        this.cashManagementInterestStep = cashManagementInterestStep;
        this.recommendProtectionStep = recommendProtectionStep;
        this.protectionEnabledStep = protectionEnabledStep;
    }

    public final HttpUrl getIntroImageUrlLight() {
        return this.introImageUrlLight;
    }

    public final HttpUrl getIntroImageUrlDark() {
        return this.introImageUrlDark;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getDescription() {
        return this.description;
    }

    public final List<UiDayTradeInfoStep> getSteps() {
        return this.steps;
    }

    public final UiDayTradeInfoStep getCashManagementStep() {
        return this.cashManagementStep;
    }

    public final UiDayTradeInfoStep getCashManagementInterestStep() {
        return this.cashManagementInterestStep;
    }

    public final UiDayTradeInfoStep getRecommendProtectionStep() {
        return this.recommendProtectionStep;
    }

    public final UiDayTradeInfoStep getProtectionEnabledStep() {
        return this.protectionEnabledStep;
    }

    public final HttpUrl imageUrlForDayNightMode(NightModeManager2 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            return this.introImageUrlLight;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.introImageUrlDark;
    }

    public final HttpUrl imageUrlForDayNightOverlay(DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        int i = WhenMappings.$EnumSwitchMapping$1[overlay.ordinal()];
        if (i == 1) {
            return this.introImageUrlLight;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.introImageUrlDark;
    }
}
