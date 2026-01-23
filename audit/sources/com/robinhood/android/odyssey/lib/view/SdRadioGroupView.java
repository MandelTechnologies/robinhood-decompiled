package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroup2;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.android.odyssey.lib.view.SdRadioGroupView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdRadioGroupInputComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdRadioGroupOption;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdRadioGroupView.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 &2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0002%&B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00142\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"H\u0002J\n\u0010$\u001a\u0004\u0018\u00010#H\u0002R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdRadioGroupView;", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioGroup;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdRadioGroupInputComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdRadioGroupInputComponent$ApiSdRadioGroupInputComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdRadioGroupInputComponent$ApiSdRadioGroupInputComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdRadioGroupInputComponent$ApiSdRadioGroupInputComponentData;)V", "mergeNewData", "newData", "onDataUpdated", "", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSubmitValue", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "setEnabled", "enabled", "", "refreshChildren", "options", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdRadioGroupOption;", "getSelectedOption", "SavedState", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdRadioGroupView extends LegacyRdsRadioGroup implements SdBaseView<ApiSdRadioGroupInputComponent, ApiSdRadioGroupInputComponent.ApiSdRadioGroupInputComponentData, SdBaseView.Callbacks> {
    public static final int ID_RES_OFFSET = 1;
    private ApiSdRadioGroupInputComponent.ApiSdRadioGroupInputComponentData data;
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdRadioGroupInputComponent apiSdRadioGroupInputComponent) {
        SdBaseView.DefaultImpls.bind(this, apiSdRadioGroupInputComponent);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onRestoreState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onRestoreState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onSaveState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onSaveState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap() {
        return SdBaseView.DefaultImpls.requireAlternateComponentOnSubmitValueMap(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public SdBaseView.Callbacks requireComponentCallbacks() {
        return SdBaseView.DefaultImpls.requireComponentCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public View requireSdView() {
        return SdBaseView.DefaultImpls.requireSdView(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(ApiSdRadioGroupInputComponent.ApiSdRadioGroupInputComponentData apiSdRadioGroupInputComponentData, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, apiSdRadioGroupInputComponentData, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdRadioGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdRadioGroupInputComponent.ApiSdRadioGroupInputComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdRadioGroupInputComponent.ApiSdRadioGroupInputComponentData apiSdRadioGroupInputComponentData) {
        this.data = apiSdRadioGroupInputComponentData;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdRadioGroupInputComponent.ApiSdRadioGroupInputComponentData mergeNewData(ApiSdRadioGroupInputComponent.ApiSdRadioGroupInputComponentData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdRadioGroupInputComponent.ApiSdRadioGroupInputComponentData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdRadioGroupInputComponent.ApiSdRadioGroupInputComponentData.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdRadioGroupInputComponent.ApiSdRadioGroupInputComponentData newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        List<ApiSdRadioGroupOption> options = newData.getOptions();
        if (options != null) {
            refreshChildren(options);
        }
        if (newData.getDefault_key() != null) {
            List<ApiSdRadioGroupOption> options2 = newData.getOptions();
            if (options2 != null) {
                Iterator<ApiSdRadioGroupOption> it = options2.iterator();
                final int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.areEqual(it.next().getKey(), newData.getDefault_key())) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    if (isAttachedToWindow()) {
                        check(i + 1);
                        return;
                    } else {
                        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.odyssey.lib.view.SdRadioGroupView$onDataUpdated$lambda$3$$inlined$doOnAttach$1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View view) {
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View view) {
                                this.removeOnAttachStateChangeListener(this);
                                this.check(i + 1);
                            }
                        });
                        return;
                    }
                }
                return;
            }
            return;
        }
        check(1);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue onSubmitValue() {
        ApiSdRadioGroupOption selectedOption = getSelectedOption();
        if (selectedOption != null) {
            return selectedOption.getTyped_value_object();
        }
        return null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(onSaveState(super.onSaveInstanceState()), getCheckedId());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(final Parcelable state) {
        Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdRadioGroupView.SavedState");
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(onRestoreState(savedState.getInSuperState()));
        if (isAttachedToWindow()) {
            check(savedState.getCheckedId());
        } else {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.odyssey.lib.view.SdRadioGroupView$onRestoreInstanceState$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    this.removeOnAttachStateChangeListener(this);
                    this.check(((SdRadioGroupView.SavedState) state).getCheckedId());
                }
            });
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Iterator<View> it = ViewGroup2.getChildren(this).iterator2();
        while (it.hasNext()) {
            it.next().setEnabled(enabled);
        }
    }

    private final void refreshChildren(List<ApiSdRadioGroupOption> options) {
        if (options != null) {
            clearCheck();
            removeAllViews();
            int i = 0;
            for (Object obj : options) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ApiSdRadioGroupOption apiSdRadioGroupOption = (ApiSdRadioGroupOption) obj;
                LegacyRdsRadioButton legacyRdsRadioButtonInflate = LegacyRdsRadioButton.INSTANCE.inflate((ViewGroup) this);
                ApiSdTextComponentData data = apiSdRadioGroupOption.getDisplay_label_primary().getData();
                Context context = legacyRdsRadioButtonInflate.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                legacyRdsRadioButtonInflate.setPrimaryText(SdTextUtil.buildSpannableString(data, context, this));
                ApiSdTextComponentData data2 = apiSdRadioGroupOption.getDisplay_label_secondary().getData();
                Context context2 = legacyRdsRadioButtonInflate.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                legacyRdsRadioButtonInflate.setSecondaryText(SdTextUtil.buildSpannableString(data2, context2, this));
                legacyRdsRadioButtonInflate.setId(i2);
                addView(legacyRdsRadioButtonInflate);
                i = i2;
            }
        }
    }

    private final ApiSdRadioGroupOption getSelectedOption() {
        List<ApiSdRadioGroupOption> options;
        ApiSdRadioGroupInputComponent.ApiSdRadioGroupInputComponentData data = getData();
        if (data == null || (options = data.getOptions()) == null) {
            return null;
        }
        return options.get(getCheckedId() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SdRadioGroupView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdRadioGroupView$SavedState;", "Landroid/view/AbsSavedState;", "inSuperState", "Landroid/os/Parcelable;", "checkedId", "", "<init>", "(Landroid/os/Parcelable;I)V", "getInSuperState", "()Landroid/os/Parcelable;", "getCheckedId", "()I", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final int checkedId;
        private final Parcelable inSuperState;

        /* compiled from: SdRadioGroupView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.inSuperState, flags);
            dest.writeInt(this.checkedId);
        }

        public final Parcelable getInSuperState() {
            return this.inSuperState;
        }

        public final int getCheckedId() {
            return this.checkedId;
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.inSuperState = parcelable;
            this.checkedId = i;
        }
    }
}
