package com.robinhood.android.event.gamedetail.p130ui.props;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PropsSelectorBar.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/props/PropsSelectionBarState;", "", "propsOptions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/gamedetail/ui/props/PropsOption;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getPropsOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PropsSelectionBarState {
    public static final int $stable = 0;
    private final ImmutableList<PropsOption> propsOptions;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PropsSelectionBarState copy$default(PropsSelectionBarState propsSelectionBarState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = propsSelectionBarState.propsOptions;
        }
        return propsSelectionBarState.copy(immutableList);
    }

    public final ImmutableList<PropsOption> component1() {
        return this.propsOptions;
    }

    public final PropsSelectionBarState copy(ImmutableList<PropsOption> propsOptions) {
        Intrinsics.checkNotNullParameter(propsOptions, "propsOptions");
        return new PropsSelectionBarState(propsOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PropsSelectionBarState) && Intrinsics.areEqual(this.propsOptions, ((PropsSelectionBarState) other).propsOptions);
    }

    public int hashCode() {
        return this.propsOptions.hashCode();
    }

    public String toString() {
        return "PropsSelectionBarState(propsOptions=" + this.propsOptions + ")";
    }

    public PropsSelectionBarState(ImmutableList<PropsOption> propsOptions) {
        Intrinsics.checkNotNullParameter(propsOptions, "propsOptions");
        this.propsOptions = propsOptions;
    }

    public final ImmutableList<PropsOption> getPropsOptions() {
        return this.propsOptions;
    }
}
