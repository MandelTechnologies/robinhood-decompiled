package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.android.models.event.p186db.predictionmarkets.ContractColumn;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroupSection;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroupSectionWithContractGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BuildGameDetailAbout.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0001¨\u0006\b"}, m3636d2 = {"buildAboutEventTypes", "", "Lcom/robinhood/android/event/gamedetail/builders/AboutEventType;", "gameContractGroups", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroup;", "prepackContractGroups", "playerPropsSections", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroupSectionWithContractGroup;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.builders.BuildGameDetailAboutKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildGameDetailAbout2 {
    public static final List<AboutEventType> buildAboutEventTypes(List<ContractGroup> list, List<ContractGroup> list2, List<ContractGroupSectionWithContractGroup> list3) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<ContractColumn> contractColumns = ((ContractGroup) it.next()).getContractColumns();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractColumns, 10));
                for (ContractColumn contractColumn : contractColumns) {
                    arrayList2.add(new AboutEventType(contractColumn.getName(), contractColumn.getEventLongDescription()));
                }
                CollectionsKt.addAll(arrayList, arrayList2);
            }
            listCreateListBuilder.addAll(arrayList);
        }
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                List<ContractColumn> contractColumns2 = ((ContractGroup) it2.next()).getContractColumns();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractColumns2, 10));
                for (ContractColumn contractColumn2 : contractColumns2) {
                    arrayList4.add(new AboutEventType(contractColumn2.getName(), contractColumn2.getEventLongDescription()));
                }
                CollectionsKt.addAll(arrayList3, arrayList4);
            }
            listCreateListBuilder.addAll(arrayList3);
        }
        if (list3 != null) {
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                ContractGroupSection contractGroupSection = ((ContractGroupSectionWithContractGroup) it3.next()).getContractGroupSection();
                List<Tuples2> listZip = CollectionsKt.zip(contractGroupSection.getEventLongDescriptionTitles(), contractGroupSection.getEventLongDescription());
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
                for (Tuples2 tuples2 : listZip) {
                    arrayList6.add(new AboutEventType((String) tuples2.component1(), (String) tuples2.component2()));
                }
                CollectionsKt.addAll(arrayList5, arrayList6);
            }
            listCreateListBuilder.addAll(arrayList5);
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
