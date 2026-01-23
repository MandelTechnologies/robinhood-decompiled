package com.robinhood.android.securitycenter.p251ui.data.personal;

import com.robinhood.analytics.EventLogger;
import com.robinhood.models.p355ui.UiPersonalDataRequestDetailsItem;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PersonalDataRequestDetailsListAdapter.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0016\u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestDetailsListAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestDetailsItemView;", "Lcom/robinhood/models/ui/UiPersonalDataRequestDetailsItem;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "expandedIndices", "", "", "onBindViewHolder", "", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "position", "", "bind", "itemView", "isExpanded", "submitList", "list", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class PersonalDataRequestDetailsListAdapter extends GenericListAdapter<PersonalDataRequestDetailsItemView, UiPersonalDataRequestDetailsItem> {
    public static final int $stable = 8;
    private final EventLogger eventLogger;
    private List<Boolean> expandedIndices;
    private final Screen screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalDataRequestDetailsListAdapter(EventLogger eventLogger, Screen screen) {
        super(PersonalDataRequestDetailsItemView.INSTANCE, DiffCallbacks.Equality.INSTANCE);
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.eventLogger = eventLogger;
        this.screen = screen;
        this.expandedIndices = new ArrayList();
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<PersonalDataRequestDetailsItemView> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        bind((PersonalDataRequestDetailsItemView) holder.getView(), this.expandedIndices.get(position).booleanValue(), position);
    }

    private final void bind(final PersonalDataRequestDetailsItemView itemView, final boolean isExpanded, final int position) {
        itemView.bind(getItem(position), this.expandedIndices.get(position).booleanValue());
        OnClickListeners.onClick(itemView, new Function0() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataRequestDetailsListAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PersonalDataRequestDetailsListAdapter.bind$lambda$0(this.f$0, itemView, position, isExpanded);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(PersonalDataRequestDetailsListAdapter personalDataRequestDetailsListAdapter, PersonalDataRequestDetailsItemView personalDataRequestDetailsItemView, int i, boolean z) {
        EventLogger.DefaultImpls.logTap$default(personalDataRequestDetailsListAdapter.eventLogger, null, personalDataRequestDetailsListAdapter.screen, new Component(Component.ComponentType.ROW, null, null, 6, null), null, null, false, 57, null);
        personalDataRequestDetailsItemView.setEnabled(false);
        personalDataRequestDetailsListAdapter.expandedIndices.set(i, Boolean.valueOf(!z));
        personalDataRequestDetailsItemView.flipToggleImage();
        personalDataRequestDetailsListAdapter.notifyItemChanged(i);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter, androidx.recyclerview.widget.ListAdapter
    public void submitList(List<UiPersonalDataRequestDetailsItem> list) {
        super.submitList(list);
        if (list != null) {
            List<UiPersonalDataRequestDetailsItem> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Boolean bool = (Boolean) CollectionsKt.getOrNull(this.expandedIndices, i);
                arrayList.add(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                i = i2;
            }
            this.expandedIndices = CollectionsKt.toMutableList((Collection) arrayList);
        }
    }
}
