package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayNightImageUrl.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÂ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/DayNightImageUrl;", "", "light", "", "dark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sharedUrl", "(Ljava/lang/String;)V", "url", "getUrl", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DayNightImageUrl {
    public static final int $stable = 0;
    private final String dark;
    private final String light;

    /* JADX WARN: Multi-variable type inference failed */
    public DayNightImageUrl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final String getLight() {
        return this.light;
    }

    /* renamed from: component2, reason: from getter */
    private final String getDark() {
        return this.dark;
    }

    public static /* synthetic */ DayNightImageUrl copy$default(DayNightImageUrl dayNightImageUrl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dayNightImageUrl.light;
        }
        if ((i & 2) != 0) {
            str2 = dayNightImageUrl.dark;
        }
        return dayNightImageUrl.copy(str, str2);
    }

    public final DayNightImageUrl copy(String light, String dark) {
        return new DayNightImageUrl(light, dark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayNightImageUrl)) {
            return false;
        }
        DayNightImageUrl dayNightImageUrl = (DayNightImageUrl) other;
        return Intrinsics.areEqual(this.light, dayNightImageUrl.light) && Intrinsics.areEqual(this.dark, dayNightImageUrl.dark);
    }

    public int hashCode() {
        String str = this.light;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dark;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DayNightImageUrl(light=" + this.light + ", dark=" + this.dark + ")";
    }

    public DayNightImageUrl(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public /* synthetic */ DayNightImageUrl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public DayNightImageUrl(String str) {
        this(str, str);
    }

    @JvmName
    public final String getUrl(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1761416807, i, -1, "com.robinhood.android.event.gamedetail.ui.DayNightImageUrl.<get-url> (DayNightImageUrl.kt:18)");
        }
        String str = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay() ? this.light : this.dark;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return str;
    }
}
