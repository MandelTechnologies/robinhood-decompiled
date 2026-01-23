package com.robinhood.android.common.detail.component.optionsposition;

import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailPageOptionsPositionViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/detail/component/optionsposition/DetailPageOptionsPositionRowViewState;", "", "title", "", "subtitle", "value", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getValue", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-detail-component_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DetailPageOptionsPositionRowViewState {
    public static final int $stable = 8;
    private final FragmentKey fragmentKey;
    private final String subtitle;
    private final String title;
    private final String value;

    public static /* synthetic */ DetailPageOptionsPositionRowViewState copy$default(DetailPageOptionsPositionRowViewState detailPageOptionsPositionRowViewState, String str, String str2, String str3, FragmentKey fragmentKey, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailPageOptionsPositionRowViewState.title;
        }
        if ((i & 2) != 0) {
            str2 = detailPageOptionsPositionRowViewState.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = detailPageOptionsPositionRowViewState.value;
        }
        if ((i & 8) != 0) {
            fragmentKey = detailPageOptionsPositionRowViewState.fragmentKey;
        }
        return detailPageOptionsPositionRowViewState.copy(str, str2, str3, fragmentKey);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component4, reason: from getter */
    public final FragmentKey getFragmentKey() {
        return this.fragmentKey;
    }

    public final DetailPageOptionsPositionRowViewState copy(String title, String subtitle, String value, FragmentKey fragmentKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        return new DetailPageOptionsPositionRowViewState(title, subtitle, value, fragmentKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailPageOptionsPositionRowViewState)) {
            return false;
        }
        DetailPageOptionsPositionRowViewState detailPageOptionsPositionRowViewState = (DetailPageOptionsPositionRowViewState) other;
        return Intrinsics.areEqual(this.title, detailPageOptionsPositionRowViewState.title) && Intrinsics.areEqual(this.subtitle, detailPageOptionsPositionRowViewState.subtitle) && Intrinsics.areEqual(this.value, detailPageOptionsPositionRowViewState.value) && Intrinsics.areEqual(this.fragmentKey, detailPageOptionsPositionRowViewState.fragmentKey);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.value.hashCode()) * 31) + this.fragmentKey.hashCode();
    }

    public String toString() {
        return "DetailPageOptionsPositionRowViewState(title=" + this.title + ", subtitle=" + this.subtitle + ", value=" + this.value + ", fragmentKey=" + this.fragmentKey + ")";
    }

    public DetailPageOptionsPositionRowViewState(String title, String subtitle, String value, FragmentKey fragmentKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        this.title = title;
        this.subtitle = subtitle;
        this.value = value;
        this.fragmentKey = fragmentKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getValue() {
        return this.value;
    }

    public final FragmentKey getFragmentKey() {
        return this.fragmentKey;
    }
}
