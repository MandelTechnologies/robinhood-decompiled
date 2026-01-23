package com.robinhood.shared.onboarding.lib.menuofoption;

import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsItem;
import com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UiMenuOfOptionsItem.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¨\u0006\u0005"}, m3636d2 = {"toUiMenuOfOptionsList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem;", "", "Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsItem;", "lib-menu-of-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItemKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class UiMenuOfOptionsItem2 {
    public static final ImmutableList<UiMenuOfOptionsItem> toUiMenuOfOptionsList(List<MenuOfOptionsItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<MenuOfOptionsItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new UiMenuOfOptionsItem.Standard((MenuOfOptionsItem) obj, !(i == list.size() - 1)));
            i = i2;
        }
        return extensions2.toImmutableList(arrayList);
    }
}
