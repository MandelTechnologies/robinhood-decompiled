package com.robinhood.android.settings.p254ui.drip;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DripSettingsAdapter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0004\u0013\u0014\u0015\u0016B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "callbacks", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$Callbacks;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemViewType", "Callbacks", "DripSettingsRowType", "DiffCallbacks", "Companion", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DripSettingsAdapter extends ListAdapter<DripSettingsRowType, GenericViewHolder<? extends View>> {
    private static final int ROW_INSTRUMENT_DISCLAIMER = 3;
    private static final int ROW_INSTRUMENT_TOGGLE = 2;
    private static final int ROW_OVERALL_HEADER = 1;
    private final Callbacks callbacks;
    public static final int $stable = 8;

    /* compiled from: DripSettingsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$Callbacks;", "", "onAccountToggled", "", "enabled", "", "onInstrumentToggled", "instrument", "Lcom/robinhood/models/db/Instrument;", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountToggled(boolean enabled);

        void onInstrumentToggled(Instrument instrument, boolean enabled);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DripSettingsAdapter(Callbacks callbacks) {
        super(DiffCallbacks.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            return new GenericViewHolder<>(DripSettingsOverallHeader.INSTANCE.inflate(parent));
        }
        if (viewType == 2) {
            return new GenericViewHolder<>(DripSettingsInstrumentToggle.INSTANCE.inflate(parent));
        }
        if (viewType == 3) {
            return new GenericViewHolder<>(DripSettingsDisclaimer.INSTANCE.inflate(parent));
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final DripSettingsRowType dripSettingsRowType = getCurrentList().get(position);
        KeyEvent.Callback view = holder.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.settings.ui.drip.DripSettingsAdapter.DripSettingsRowType>");
        Intrinsics.checkNotNull(dripSettingsRowType);
        ((Bindable) view).bind(dripSettingsRowType);
        if (dripSettingsRowType instanceof DripSettingsRowType.DripOverallHeader) {
            View view2 = holder.getView();
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.settings.ui.drip.DripSettingsOverallHeader");
            ((DripSettingsOverallHeader) view2).onCheckChanged(new Function1() { // from class: com.robinhood.android.settings.ui.drip.DripSettingsAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DripSettingsAdapter.onBindViewHolder$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
        } else if (dripSettingsRowType instanceof DripSettingsRowType.DripInstrumentToggle) {
            View view3 = holder.getView();
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.settings.ui.drip.DripSettingsInstrumentToggle");
            ((DripSettingsInstrumentToggle) view3).onCheckChanged(new Function1() { // from class: com.robinhood.android.settings.ui.drip.DripSettingsAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DripSettingsAdapter.onBindViewHolder$lambda$1(this.f$0, dripSettingsRowType, ((Boolean) obj).booleanValue());
                }
            });
        } else if (!(dripSettingsRowType instanceof DripSettingsRowType.DripInstrumentDisclaimer)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(DripSettingsAdapter dripSettingsAdapter, boolean z) {
        dripSettingsAdapter.callbacks.onAccountToggled(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(DripSettingsAdapter dripSettingsAdapter, DripSettingsRowType dripSettingsRowType, boolean z) {
        dripSettingsAdapter.callbacks.onInstrumentToggled(((DripSettingsRowType.DripInstrumentToggle) dripSettingsRowType).getInstrument(), z);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        DripSettingsRowType dripSettingsRowType = getCurrentList().get(position);
        if (dripSettingsRowType instanceof DripSettingsRowType.DripOverallHeader) {
            return 1;
        }
        if (dripSettingsRowType instanceof DripSettingsRowType.DripInstrumentToggle) {
            return 2;
        }
        if (dripSettingsRowType instanceof DripSettingsRowType.DripInstrumentDisclaimer) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DripSettingsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType;", "", "<init>", "()V", "DripOverallHeader", "DripInstrumentToggle", "DripInstrumentDisclaimer", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType$DripInstrumentDisclaimer;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType$DripInstrumentToggle;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType$DripOverallHeader;", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class DripSettingsRowType {
        public static final int $stable = 0;

        public /* synthetic */ DripSettingsRowType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DripSettingsRowType() {
        }

        /* compiled from: DripSettingsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType$DripOverallHeader;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType;", "enabled", "", "<init>", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DripOverallHeader extends DripSettingsRowType {
            public static final int $stable = 0;
            private final boolean enabled;

            public static /* synthetic */ DripOverallHeader copy$default(DripOverallHeader dripOverallHeader, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = dripOverallHeader.enabled;
                }
                return dripOverallHeader.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            public final DripOverallHeader copy(boolean enabled) {
                return new DripOverallHeader(enabled);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DripOverallHeader) && this.enabled == ((DripOverallHeader) other).enabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.enabled);
            }

            public String toString() {
                return "DripOverallHeader(enabled=" + this.enabled + ")";
            }

            public DripOverallHeader(boolean z) {
                super(null);
                this.enabled = z;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }
        }

        /* compiled from: DripSettingsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType$DripInstrumentToggle;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType;", "instrument", "Lcom/robinhood/models/db/Instrument;", "selected", "", "<init>", "(Lcom/robinhood/models/db/Instrument;Z)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DripInstrumentToggle extends DripSettingsRowType {
            public static final int $stable = 8;
            private final Instrument instrument;
            private final boolean selected;

            public static /* synthetic */ DripInstrumentToggle copy$default(DripInstrumentToggle dripInstrumentToggle, Instrument instrument, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    instrument = dripInstrumentToggle.instrument;
                }
                if ((i & 2) != 0) {
                    z = dripInstrumentToggle.selected;
                }
                return dripInstrumentToggle.copy(instrument, z);
            }

            /* renamed from: component1, reason: from getter */
            public final Instrument getInstrument() {
                return this.instrument;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getSelected() {
                return this.selected;
            }

            public final DripInstrumentToggle copy(Instrument instrument, boolean selected) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return new DripInstrumentToggle(instrument, selected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DripInstrumentToggle)) {
                    return false;
                }
                DripInstrumentToggle dripInstrumentToggle = (DripInstrumentToggle) other;
                return Intrinsics.areEqual(this.instrument, dripInstrumentToggle.instrument) && this.selected == dripInstrumentToggle.selected;
            }

            public int hashCode() {
                return (this.instrument.hashCode() * 31) + Boolean.hashCode(this.selected);
            }

            public String toString() {
                return "DripInstrumentToggle(instrument=" + this.instrument + ", selected=" + this.selected + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DripInstrumentToggle(Instrument instrument, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                this.instrument = instrument;
                this.selected = z;
            }

            public final Instrument getInstrument() {
                return this.instrument;
            }

            public final boolean getSelected() {
                return this.selected;
            }
        }

        /* compiled from: DripSettingsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType$DripInstrumentDisclaimer;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType;", "<init>", "()V", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DripInstrumentDisclaimer extends DripSettingsRowType {
            public static final int $stable = 0;
            public static final DripInstrumentDisclaimer INSTANCE = new DripInstrumentDisclaimer();

            private DripInstrumentDisclaimer() {
                super(null);
            }
        }
    }

    /* compiled from: DripSettingsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DiffCallbacks;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class DiffCallbacks extends DiffUtil.ItemCallback<DripSettingsRowType> {
        public static final DiffCallbacks INSTANCE = new DiffCallbacks();

        private DiffCallbacks() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(DripSettingsRowType oldItem, DripSettingsRowType newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof DripSettingsRowType.DripOverallHeader) && (newItem instanceof DripSettingsRowType.DripOverallHeader)) {
                return true;
            }
            if ((oldItem instanceof DripSettingsRowType.DripInstrumentToggle) && (newItem instanceof DripSettingsRowType.DripInstrumentToggle)) {
                return Intrinsics.areEqual(((DripSettingsRowType.DripInstrumentToggle) oldItem).getInstrument().getId(), ((DripSettingsRowType.DripInstrumentToggle) newItem).getInstrument().getId());
            }
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(DripSettingsRowType oldItem, DripSettingsRowType newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
