package com.robinhood.android.margin.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.models.parceler.HttpUrlParceler;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: UiDayTradeInfoVariant.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/margin/model/UiDayTradeInfoVariant;", "Landroid/os/Parcelable;", "mobileImageUrlLight", "Lokhttp3/HttpUrl;", "mobileImageUrlDark", "title", "", "description", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "<init>", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;)V", "getMobileImageUrlLight", "()Lokhttp3/HttpUrl;", "getMobileImageUrlDark", "getTitle", "()Ljava/lang/String;", "getDescription", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "imageUrlForDayNightMode", "mode", "Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "imageUrlForDayNightOverlay", "overlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UiDayTradeInfoVariant implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiDayTradeInfoVariant> CREATOR = new Creator();
    private final MarkdownContent description;
    private final HttpUrl mobileImageUrlDark;
    private final HttpUrl mobileImageUrlLight;
    private final String title;

    /* compiled from: UiDayTradeInfoVariant.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiDayTradeInfoVariant> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDayTradeInfoVariant createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            HttpUrlParceler httpUrlParceler = HttpUrlParceler.INSTANCE;
            return new UiDayTradeInfoVariant(httpUrlParceler.create(parcel), httpUrlParceler.create(parcel), parcel.readString(), (MarkdownContent) parcel.readParcelable(UiDayTradeInfoVariant.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDayTradeInfoVariant[] newArray(int i) {
            return new UiDayTradeInfoVariant[i];
        }
    }

    /* compiled from: UiDayTradeInfoVariant.kt */
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
        httpUrlParceler.write(this.mobileImageUrlLight, dest, flags);
        httpUrlParceler.write(this.mobileImageUrlDark, dest, flags);
        dest.writeString(this.title);
        dest.writeParcelable(this.description, flags);
    }

    public UiDayTradeInfoVariant(HttpUrl mobileImageUrlLight, HttpUrl mobileImageUrlDark, String title, MarkdownContent description) {
        Intrinsics.checkNotNullParameter(mobileImageUrlLight, "mobileImageUrlLight");
        Intrinsics.checkNotNullParameter(mobileImageUrlDark, "mobileImageUrlDark");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.mobileImageUrlLight = mobileImageUrlLight;
        this.mobileImageUrlDark = mobileImageUrlDark;
        this.title = title;
        this.description = description;
    }

    public final HttpUrl getMobileImageUrlLight() {
        return this.mobileImageUrlLight;
    }

    public final HttpUrl getMobileImageUrlDark() {
        return this.mobileImageUrlDark;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getDescription() {
        return this.description;
    }

    public final HttpUrl imageUrlForDayNightMode(NightModeManager2 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            return this.mobileImageUrlLight;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.mobileImageUrlDark;
    }

    public final HttpUrl imageUrlForDayNightOverlay(DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        int i = WhenMappings.$EnumSwitchMapping$1[overlay.ordinal()];
        if (i == 1) {
            return this.mobileImageUrlLight;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.mobileImageUrlDark;
    }
}
