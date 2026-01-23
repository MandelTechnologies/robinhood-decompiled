package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.shared.portfolio.lists.p391ui.CuratedListViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"isSubzeroMember", "", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState;", "(Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState;)Z", "isInEtfSupportedRegion", "lib-lists-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListViewStateKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CuratedListViewState2 {
    public static final boolean isSubzeroMember(CuratedListViewState curatedListViewState) {
        Intrinsics.checkNotNullParameter(curatedListViewState, "<this>");
        if (curatedListViewState instanceof CuratedListViewState.Loaded) {
            return ((CuratedListViewState.Loaded) curatedListViewState).getSubzeroEnabled();
        }
        if (Intrinsics.areEqual(curatedListViewState, CuratedListViewState.Loading.INSTANCE)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isInEtfSupportedRegion(CuratedListViewState curatedListViewState) {
        Intrinsics.checkNotNullParameter(curatedListViewState, "<this>");
        if (curatedListViewState instanceof CuratedListViewState.Loaded) {
            return ((CuratedListViewState.Loaded) curatedListViewState).isInEtfSupportedRegion();
        }
        if (Intrinsics.areEqual(curatedListViewState, CuratedListViewState.Loading.INSTANCE)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
