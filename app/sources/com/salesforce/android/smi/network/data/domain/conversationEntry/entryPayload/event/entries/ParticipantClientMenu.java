package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.event.entries;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.optionItem.OptionItem;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ParticipantClientMenu.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/entries/ParticipantClientMenu;", "", "optionItems", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/optionItem/OptionItem$TypedOptionItem$ParticipantClientMenuOptionItem;", "<init>", "(Ljava/util/List;)V", "getOptionItems", "()Ljava/util/List;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ParticipantClientMenu {
    private final List<OptionItem.TypedOptionItem.ParticipantClientMenuOptionItem> optionItems;

    public ParticipantClientMenu(@Json(name = "menuOptions") List<OptionItem.TypedOptionItem.ParticipantClientMenuOptionItem> optionItems) {
        Intrinsics.checkNotNullParameter(optionItems, "optionItems");
        this.optionItems = optionItems;
    }

    public final List<OptionItem.TypedOptionItem.ParticipantClientMenuOptionItem> getOptionItems() {
        return this.optionItems;
    }
}
