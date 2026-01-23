package com.robinhood.android.cash.transaction.p079ui.category;

import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MerchantChangeCategoryViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryViewState;", "", "isLoading", "", "categories", "", "Lcom/robinhood/android/cash/transaction/ui/category/MerchantCategory;", "selectedCategory", "result", "Lcom/robinhood/udf/UiEvent;", "Lkotlin/Result;", "", "<init>", "(ZLjava/util/List;Lcom/robinhood/android/cash/transaction/ui/category/MerchantCategory;Lcom/robinhood/udf/UiEvent;)V", "()Z", "getCategories", "()Ljava/util/List;", "getSelectedCategory", "()Lcom/robinhood/android/cash/transaction/ui/category/MerchantCategory;", "getResult", "()Lcom/robinhood/udf/UiEvent;", "rows", "Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryViewState$RowState;", "getRows", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "RowState", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class MerchantChangeCategoryViewState {
    public static final int $stable = 8;
    private final List<MerchantCategory> categories;
    private final boolean isLoading;
    private final UiEvent<Result<Unit>> result;
    private final MerchantCategory selectedCategory;

    public MerchantChangeCategoryViewState() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MerchantChangeCategoryViewState copy$default(MerchantChangeCategoryViewState merchantChangeCategoryViewState, boolean z, List list, MerchantCategory merchantCategory, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = merchantChangeCategoryViewState.isLoading;
        }
        if ((i & 2) != 0) {
            list = merchantChangeCategoryViewState.categories;
        }
        if ((i & 4) != 0) {
            merchantCategory = merchantChangeCategoryViewState.selectedCategory;
        }
        if ((i & 8) != 0) {
            uiEvent = merchantChangeCategoryViewState.result;
        }
        return merchantChangeCategoryViewState.copy(z, list, merchantCategory, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<MerchantCategory> component2() {
        return this.categories;
    }

    /* renamed from: component3, reason: from getter */
    public final MerchantCategory getSelectedCategory() {
        return this.selectedCategory;
    }

    public final UiEvent<Result<Unit>> component4() {
        return this.result;
    }

    public final MerchantChangeCategoryViewState copy(boolean isLoading, List<? extends MerchantCategory> categories, MerchantCategory selectedCategory, UiEvent<Result<Unit>> result) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(selectedCategory, "selectedCategory");
        return new MerchantChangeCategoryViewState(isLoading, categories, selectedCategory, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantChangeCategoryViewState)) {
            return false;
        }
        MerchantChangeCategoryViewState merchantChangeCategoryViewState = (MerchantChangeCategoryViewState) other;
        return this.isLoading == merchantChangeCategoryViewState.isLoading && Intrinsics.areEqual(this.categories, merchantChangeCategoryViewState.categories) && this.selectedCategory == merchantChangeCategoryViewState.selectedCategory && Intrinsics.areEqual(this.result, merchantChangeCategoryViewState.result);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isLoading) * 31) + this.categories.hashCode()) * 31) + this.selectedCategory.hashCode()) * 31;
        UiEvent<Result<Unit>> uiEvent = this.result;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    public String toString() {
        return "MerchantChangeCategoryViewState(isLoading=" + this.isLoading + ", categories=" + this.categories + ", selectedCategory=" + this.selectedCategory + ", result=" + this.result + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MerchantChangeCategoryViewState(boolean z, List<? extends MerchantCategory> categories, MerchantCategory selectedCategory, UiEvent<Result<Unit>> uiEvent) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(selectedCategory, "selectedCategory");
        this.isLoading = z;
        this.categories = categories;
        this.selectedCategory = selectedCategory;
        this.result = uiEvent;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ MerchantChangeCategoryViewState(boolean z, List list, MerchantCategory merchantCategory, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? ArraysKt.toList(MerchantCategory.values()) : list, (i & 4) != 0 ? MerchantCategory.OTHER : merchantCategory, (i & 8) != 0 ? null : uiEvent);
    }

    public final List<MerchantCategory> getCategories() {
        return this.categories;
    }

    public final MerchantCategory getSelectedCategory() {
        return this.selectedCategory;
    }

    public final UiEvent<Result<Unit>> getResult() {
        return this.result;
    }

    public final List<RowState> getRows() {
        List<MerchantCategory> list = this.categories;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (MerchantCategory merchantCategory : list) {
            arrayList.add(new RowState(merchantCategory, merchantCategory == this.selectedCategory, true ^ this.isLoading));
        }
        return arrayList;
    }

    /* compiled from: MerchantChangeCategoryViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryViewState$RowState;", "", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/android/cash/transaction/ui/category/MerchantCategory;", "isSelected", "", "isEnabled", "<init>", "(Lcom/robinhood/android/cash/transaction/ui/category/MerchantCategory;ZZ)V", "getCategory", "()Lcom/robinhood/android/cash/transaction/ui/category/MerchantCategory;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RowState {
        public static final int $stable = 0;
        private final MerchantCategory category;
        private final boolean isEnabled;
        private final boolean isSelected;

        public static /* synthetic */ RowState copy$default(RowState rowState, MerchantCategory merchantCategory, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                merchantCategory = rowState.category;
            }
            if ((i & 2) != 0) {
                z = rowState.isSelected;
            }
            if ((i & 4) != 0) {
                z2 = rowState.isEnabled;
            }
            return rowState.copy(merchantCategory, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final MerchantCategory getCategory() {
            return this.category;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final RowState copy(MerchantCategory category, boolean isSelected, boolean isEnabled) {
            Intrinsics.checkNotNullParameter(category, "category");
            return new RowState(category, isSelected, isEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RowState)) {
                return false;
            }
            RowState rowState = (RowState) other;
            return this.category == rowState.category && this.isSelected == rowState.isSelected && this.isEnabled == rowState.isEnabled;
        }

        public int hashCode() {
            return (((this.category.hashCode() * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isEnabled);
        }

        public String toString() {
            return "RowState(category=" + this.category + ", isSelected=" + this.isSelected + ", isEnabled=" + this.isEnabled + ")";
        }

        public RowState(MerchantCategory category, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(category, "category");
            this.category = category;
            this.isSelected = z;
            this.isEnabled = z2;
        }

        public final MerchantCategory getCategory() {
            return this.category;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }
    }
}
