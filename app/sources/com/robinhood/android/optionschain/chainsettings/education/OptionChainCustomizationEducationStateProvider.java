package com.robinhood.android.optionschain.chainsettings.education;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.EducationCategory;
import com.robinhood.models.p320db.EducationItem;
import com.robinhood.models.p320db.OptionChainCustomizationEducation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionChainCustomizationEducationStateProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationDataState;", "Lcom/robinhood/android/optionschain/chainsettings/education/OptionChainCustomizationEducationViewState;", "<init>", "()V", "reduce", "dataState", "getEducationCategories", "", "", "getEducationItemsInSelectedCategory", "Lcom/robinhood/models/db/EducationItem;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainCustomizationEducationStateProvider implements StateProvider<OptionChainCustomizationEducationDataState, OptionChainCustomizationEducationViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public OptionChainCustomizationEducationViewState reduce(OptionChainCustomizationEducationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new OptionChainCustomizationEducationViewState(dataState.getLaunchMode(), dataState.getSelectedCategoryIndex(), extensions2.toImmutableList(getEducationCategories(dataState)), extensions2.toImmutableList(getEducationItemsInSelectedCategory(dataState)));
    }

    private final List<String> getEducationCategories(OptionChainCustomizationEducationDataState dataState) {
        OptionChainCustomizationEducation customizationEducation = dataState.getCustomizationEducation();
        List<EducationCategory> educationItems = customizationEducation != null ? customizationEducation.getEducationItems() : null;
        if (educationItems == null || educationItems.size() <= 1) {
            return CollectionsKt.emptyList();
        }
        List<EducationCategory> list = educationItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EducationCategory) it.next()).getCategoryLabel());
        }
        return arrayList;
    }

    private final List<EducationItem> getEducationItemsInSelectedCategory(OptionChainCustomizationEducationDataState dataState) {
        OptionChainCustomizationEducation customizationEducation = dataState.getCustomizationEducation();
        List<EducationCategory> educationItems = customizationEducation != null ? customizationEducation.getEducationItems() : null;
        if (dataState.getSelectedCategoryIndex() != null && educationItems != null && CollectionsKt.getOrNull(educationItems, dataState.getSelectedCategoryIndex().intValue()) != null) {
            return dataState.getCustomizationEducation().getEducationItems().get(dataState.getSelectedCategoryIndex().intValue()).getItems();
        }
        return CollectionsKt.emptyList();
    }
}
