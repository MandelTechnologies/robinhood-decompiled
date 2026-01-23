package com.robinhood.android.psp;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.psp.ProgramDetailCardView;
import com.robinhood.android.psp.ProgramDetailDisclosureView;
import com.robinhood.android.psp.ProgramDetailValuePropsView;
import com.robinhood.models.p320db.bonfire.ProgramDetailSection;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgramDetailSectionAdapter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailSectionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/models/db/bonfire/ProgramDetailSection;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/psp/ProgramDetailSectionAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/psp/ProgramDetailSectionAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/psp/ProgramDetailSectionAdapter$Callbacks;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemViewType", "Callbacks", "ViewType", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProgramDetailSectionAdapter extends ListAdapter<ProgramDetailSection, GenericViewHolder<? extends View>> {
    public static final int $stable = 8;
    private Callbacks callbacks;

    /* compiled from: ProgramDetailSectionAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailSectionAdapter$Callbacks;", "Lcom/robinhood/android/psp/ProgramDetailValuePropsView$Callbacks;", "Lcom/robinhood/android/psp/ProgramDetailDisclosureView$Callbacks;", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends ProgramDetailValuePropsView.Callbacks, ProgramDetailDisclosureView.Callbacks {
    }

    /* compiled from: ProgramDetailSectionAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.CARD_MODULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.VALUE_PROPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.DISCLOSURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProgramDetailSectionAdapter() {
        super(new DiffUtil.ItemCallback<ProgramDetailSection>() { // from class: com.robinhood.android.psp.ProgramDetailSectionAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areItemsTheSame(ProgramDetailSection oldItem, ProgramDetailSection newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if ((oldItem instanceof ProgramDetailSection.CardModule) && (newItem instanceof ProgramDetailSection.CardModule)) {
                    return Intrinsics.areEqual(((ProgramDetailSection.CardModule) oldItem).getHeaderValue(), ((ProgramDetailSection.CardModule) newItem).getHeaderValue());
                }
                if ((oldItem instanceof ProgramDetailSection.Disclosure) && (newItem instanceof ProgramDetailSection.Disclosure)) {
                    return Intrinsics.areEqual(((ProgramDetailSection.Disclosure) oldItem).getMarkdown(), ((ProgramDetailSection.Disclosure) newItem).getMarkdown());
                }
                if ((oldItem instanceof ProgramDetailSection.ValueProps) && (newItem instanceof ProgramDetailSection.ValueProps)) {
                    return Intrinsics.areEqual(((ProgramDetailSection.ValueProps) oldItem).getList(), ((ProgramDetailSection.ValueProps) newItem).getList());
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areContentsTheSame(ProgramDetailSection oldItem, ProgramDetailSection newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem, newItem);
            }
        });
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = WhenMappings.$EnumSwitchMapping$0[ViewType.values()[viewType].ordinal()];
        if (i == 1) {
            viewInflate = ProgramDetailCardView.INSTANCE.inflate(parent);
        } else if (i == 2) {
            viewInflate = ProgramDetailValuePropsView.INSTANCE.inflate(parent);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            viewInflate = ViewGroups.inflate$default(parent, C25966R.layout.include_program_details_disclosure, false, 2, null);
        }
        return new GenericViewHolder<>(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ProgramDetailSection item = getItem(position);
        if (item instanceof ProgramDetailSection.CardModule) {
            View view = holder.getView();
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.psp.ProgramDetailCardView");
            ProgramDetailSection.CardModule cardModule = (ProgramDetailSection.CardModule) item;
            ((ProgramDetailCardView) view).bind(new ProgramDetailCardView.GiftDetailsCard(cardModule.getHeaderLabel(), cardModule.getHeaderValue(), cardModule.getHeaderValueLargeTextRange(), cardModule.getHeaderValuePillTextRange(), cardModule.getHeaderLogo(), cardModule.getHeaderLogoBackgroundColor(), cardModule.getMiddleLabel(), cardModule.getMiddleValue(), cardModule.getFooterRow().getPrimaryText(), cardModule.getFooterRow().getSecondaryText(), cardModule.getFooterRow().getMetadata(), cardModule.getFooterRow().getSecondaryMetadata()));
            return;
        }
        if (item instanceof ProgramDetailSection.ValueProps) {
            View view2 = holder.getView();
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.psp.ProgramDetailValuePropsView");
            ((ProgramDetailValuePropsView) view2).bind(((ProgramDetailSection.ValueProps) item).getList(), this.callbacks);
        } else {
            if (!(item instanceof ProgramDetailSection.Disclosure)) {
                throw new NoWhenBranchMatchedException();
            }
            View view3 = holder.getView();
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.psp.ProgramDetailDisclosureView");
            ((ProgramDetailDisclosureView) view3).bind(((ProgramDetailSection.Disclosure) item).getMarkdown(), this.callbacks);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        ProgramDetailSection item = getItem(position);
        if (item instanceof ProgramDetailSection.CardModule) {
            return ViewType.CARD_MODULE.ordinal();
        }
        if (item instanceof ProgramDetailSection.ValueProps) {
            return ViewType.VALUE_PROPS.ordinal();
        }
        if (item instanceof ProgramDetailSection.Disclosure) {
            return ViewType.DISCLOSURE.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProgramDetailSectionAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailSectionAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "CARD_MODULE", "VALUE_PROPS", "DISCLOSURE", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType CARD_MODULE = new ViewType("CARD_MODULE", 0);
        public static final ViewType VALUE_PROPS = new ViewType("VALUE_PROPS", 1);
        public static final ViewType DISCLOSURE = new ViewType("DISCLOSURE", 2);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{CARD_MODULE, VALUE_PROPS, DISCLOSURE};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i) {
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(viewTypeArr$values);
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }
}
