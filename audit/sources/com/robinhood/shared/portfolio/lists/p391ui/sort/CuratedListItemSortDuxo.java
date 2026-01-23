package com.robinhood.shared.portfolio.lists.p391ui.sort;

import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p355ui.SortOption;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListItemSortDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000b¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListItemSortDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListItemSortViewState;", "<init>", "()V", "setIsFuturesOnlyList", "", "isFuturesOnlyList", "", "setSortOption", "initialSortOption", "Lcom/robinhood/models/ui/SortOption;", "updateSortOption", "selectedSortOption", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CuratedListItemSortDuxo extends OldBaseDuxo<CuratedListItemSortViewState> {
    public static final int $stable = OldBaseDuxo.$stable;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public CuratedListItemSortDuxo() {
        Object[] objArr = 0 == true ? 1 : 0;
        super(new CuratedListItemSortViewState(null, null, false, 7, null), objArr, 2, 0 == true ? 1 : 0);
    }

    public final void setIsFuturesOnlyList(final boolean isFuturesOnlyList) {
        applyMutation(new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.sort.CuratedListItemSortDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListItemSortDuxo.setIsFuturesOnlyList$lambda$0(isFuturesOnlyList, (CuratedListItemSortViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListItemSortViewState setIsFuturesOnlyList$lambda$0(boolean z, CuratedListItemSortViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListItemSortViewState.copy$default(applyMutation, null, null, z, 3, null);
    }

    public final void setSortOption(final SortOption initialSortOption) {
        Intrinsics.checkNotNullParameter(initialSortOption, "initialSortOption");
        applyMutation(new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.sort.CuratedListItemSortDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListItemSortDuxo.setSortOption$lambda$1(initialSortOption, (CuratedListItemSortViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListItemSortViewState setSortOption$lambda$1(SortOption sortOption, CuratedListItemSortViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListItemSortViewState.copy$default(applyMutation, sortOption.getSortOrder(), sortOption.getSortDirection(), false, 4, null);
    }

    public final void updateSortOption(final SortOption selectedSortOption) {
        Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
        applyMutation(new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.sort.CuratedListItemSortDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListItemSortDuxo.updateSortOption$lambda$2(selectedSortOption, (CuratedListItemSortViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListItemSortViewState updateSortOption$lambda$2(SortOption sortOption, CuratedListItemSortViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ApiCuratedList.SortOrder sortOrder = sortOption.getSortOrder();
        ApiCuratedList.SortDirection sortDirection = sortOption.getSortDirection();
        ApiCuratedList.SortDirection[] sortDirectionArrValues = ApiCuratedList.SortDirection.values();
        return CuratedListItemSortViewState.copy$default(applyMutation, sortOrder, sortDirectionArrValues[(sortDirection.ordinal() + 1) % sortDirectionArrValues.length], false, 4, null);
    }
}
