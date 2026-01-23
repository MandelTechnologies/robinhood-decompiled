package com.robinhood.android.options.p208ui.detail;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageBodyState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodyState;", "", "sections", "", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState;", "<init>", "(Ljava/util/List;)V", "getSections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsDetailPageBodyState {
    public static final int $stable = 8;
    private final List<OptionsDetailPageBodyState2> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionsDetailPageBodyState copy$default(OptionsDetailPageBodyState optionsDetailPageBodyState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = optionsDetailPageBodyState.sections;
        }
        return optionsDetailPageBodyState.copy(list);
    }

    public final List<OptionsDetailPageBodyState2> component1() {
        return this.sections;
    }

    public final OptionsDetailPageBodyState copy(List<? extends OptionsDetailPageBodyState2> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new OptionsDetailPageBodyState(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OptionsDetailPageBodyState) && Intrinsics.areEqual(this.sections, ((OptionsDetailPageBodyState) other).sections);
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    public String toString() {
        return "OptionsDetailPageBodyState(sections=" + this.sections + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsDetailPageBodyState(List<? extends OptionsDetailPageBodyState2> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.sections = sections;
    }

    public final List<OptionsDetailPageBodyState2> getSections() {
        return this.sections;
    }
}
