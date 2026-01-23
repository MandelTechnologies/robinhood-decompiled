package com.robinhood.android.common.detail.component.about;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DetailPageAboutViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/detail/component/about/DetailPageAboutExpandState;", "", "<init>", "(Ljava/lang/String;I)V", "COLLAPSED", "EXPANDED", "NONE", "feature-lib-detail-component_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.detail.component.about.DetailPageAboutExpandState, reason: use source file name */
/* loaded from: classes2.dex */
public final class DetailPageAboutViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DetailPageAboutViewState2[] $VALUES;
    public static final DetailPageAboutViewState2 COLLAPSED = new DetailPageAboutViewState2("COLLAPSED", 0);
    public static final DetailPageAboutViewState2 EXPANDED = new DetailPageAboutViewState2("EXPANDED", 1);
    public static final DetailPageAboutViewState2 NONE = new DetailPageAboutViewState2("NONE", 2);

    private static final /* synthetic */ DetailPageAboutViewState2[] $values() {
        return new DetailPageAboutViewState2[]{COLLAPSED, EXPANDED, NONE};
    }

    public static EnumEntries<DetailPageAboutViewState2> getEntries() {
        return $ENTRIES;
    }

    private DetailPageAboutViewState2(String str, int i) {
    }

    static {
        DetailPageAboutViewState2[] detailPageAboutViewState2Arr$values = $values();
        $VALUES = detailPageAboutViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(detailPageAboutViewState2Arr$values);
    }

    public static DetailPageAboutViewState2 valueOf(String str) {
        return (DetailPageAboutViewState2) Enum.valueOf(DetailPageAboutViewState2.class, str);
    }

    public static DetailPageAboutViewState2[] values() {
        return (DetailPageAboutViewState2[]) $VALUES.clone();
    }
}
