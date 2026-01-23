package com.truelayer.payments.p419ui.screens.formflows.model;

import com.truelayer.payments.core.domain.payments.FormInput;
import com.truelayer.payments.p419ui.utils.StringExtensions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SelectOption.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"intoSelectOption", "Lcom/truelayer/payments/ui/screens/formflows/model/SelectOption;", "Lcom/truelayer/payments/core/domain/payments/FormInput$Select$SelectOption;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.formflows.model.SelectOptionKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SelectOption2 {
    public static final SelectOption intoSelectOption(FormInput.Select.SelectOption selectOption) {
        Intrinsics.checkNotNullParameter(selectOption, "<this>");
        String id = selectOption.getId();
        String text = selectOption.getLabel().getText();
        String imageUrl = selectOption.getImageUrl();
        List<String> searchAliases = selectOption.getSearchAliases();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(searchAliases, 10));
        Iterator<T> it = searchAliases.iterator();
        while (it.hasNext()) {
            arrayList.add(StringExtensions.searchNormalizeLowercase((String) it.next()));
        }
        return new SelectOption(id, text, imageUrl, null, null, arrayList, 16, null);
    }
}
