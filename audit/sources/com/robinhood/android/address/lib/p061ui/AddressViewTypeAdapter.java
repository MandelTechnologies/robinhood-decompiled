package com.robinhood.android.address.lib.p061ui;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.robinhood.android.address.lib.p061ui.AddressViewType;
import com.robinhood.android.address.lib.p061ui.ManualAddressReason;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddressViewTypeAdapter.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001e\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0018\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/address/lib/ui/AddressViewTypeAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/address/lib/ui/AddressViewType;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "fallbackText", "", "<init>", "(Ljava/lang/String;)V", "callbacks", "Lcom/robinhood/android/address/lib/ui/AddressViewTypeAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/address/lib/ui/AddressViewTypeAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/address/lib/ui/AddressViewTypeAdapter$Callbacks;)V", "onCreateViewHolder", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "Callbacks", "feature-lib-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AddressViewTypeAdapter extends ListAdapter<AddressViewType, GenericViewHolder<? extends View>> {
    private Callbacks callbacks;
    private final String fallbackText;

    /* compiled from: AddressViewTypeAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/address/lib/ui/AddressViewTypeAdapter$Callbacks;", "", "onAddressSelected", "", "placeId", "", "onManualAddressInputSelected", "reason", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason;", "feature-lib-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAddressSelected(String placeId);

        void onManualAddressInputSelected(ManualAddressReason reason);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressViewTypeAdapter(String fallbackText) {
        super(DiffCallbacks.Equality.INSTANCE);
        Intrinsics.checkNotNullParameter(fallbackText, "fallbackText");
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.fallbackText = fallbackText;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<RdsRowView> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new GenericViewHolder<>(RdsRowView.INSTANCE.inflate(parent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AddressViewType item = getItem(position);
        View view = holder.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
        RdsRowView rdsRowView = (RdsRowView) view;
        if (item instanceof AddressViewType.Prediction) {
            final AutocompletePrediction data = ((AddressViewType.Prediction) item).getData();
            SpannableString primaryText = data.getPrimaryText(null);
            Intrinsics.checkNotNullExpressionValue(primaryText, "getPrimaryText(...)");
            RdsRowView.bind$default(rdsRowView, primaryText, data.getSecondaryText(null), null, null, null, 28, null);
            OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.address.lib.ui.AddressViewTypeAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AddressViewTypeAdapter.onBindViewHolder$lambda$2$lambda$0(this.f$0, data);
                }
            });
            return;
        }
        if (!(item instanceof AddressViewType.ManualInput)) {
            throw new NoWhenBranchMatchedException();
        }
        RdsRowView.bind$default(rdsRowView, this.fallbackText, null, null, null, null, 28, null);
        rdsRowView.setPrimaryTextColor(ResourceReferences5.toColorStateList(new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorForeground2)));
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.address.lib.ui.AddressViewTypeAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddressViewTypeAdapter.onBindViewHolder$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2$lambda$0(AddressViewTypeAdapter addressViewTypeAdapter, AutocompletePrediction autocompletePrediction) {
        Callbacks callbacks = addressViewTypeAdapter.callbacks;
        if (callbacks != null) {
            String placeId = autocompletePrediction.getPlaceId();
            Intrinsics.checkNotNullExpressionValue(placeId, "getPlaceId(...)");
            callbacks.onAddressSelected(placeId);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2$lambda$1(AddressViewTypeAdapter addressViewTypeAdapter) {
        Callbacks callbacks = addressViewTypeAdapter.callbacks;
        if (callbacks != null) {
            callbacks.onManualAddressInputSelected(ManualAddressReason.UserAction.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
